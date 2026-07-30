package com.crrepa.band.my.device.contact.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.contact.model.ContactAvatarChangeEvent;
import com.crrepa.band.my.model.ContactInfo;
import com.crrepa.band.my.model.ContactModel;
import com.crrepa.band.my.model.band.provider.BandQuickContactProvider;
import com.crrepa.band.my.model.db.Contact;
import com.crrepa.band.my.model.db.QuickContartConfig;
import com.crrepa.band.my.model.db.proxy.QuickContartConfigDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.g;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements f {
    private List<Contact> hideContactList;
    private int maxContactCount;
    private List<Contact> selectedContactList = new ArrayList();
    private String selectedContactNumber;
    private x0.b view;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(List<ContactModel> list) {
            b.this.showAllContact(list);
        }
    }

    /* renamed from: com.crrepa.band.my.device.contact.presenter.b$b, reason: collision with other inner class name */
    class C0175b implements Consumer {
        C0175b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class c implements ObservableOnSubscribe {
        final /* synthetic */ Context val$context;

        c(Context context) {
            this.val$context = context;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        @SuppressLint({"CheckResult"})
        public void subscribe(ObservableEmitter<List<ContactModel>> observableEmitter) {
            observableEmitter.onNext(b.this.formatContactList(w0.a.getAllContact(this.val$context, BandQuickContactProvider.supportSymbol())));
            com.orhanobut.logger.f.d("getAllContact: " + System.currentTimeMillis());
            observableEmitter.onComplete();
        }
    }

    public b() {
        this.maxContactCount = 8;
        QuickContartConfig quickContartConfig = new QuickContartConfigDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (quickContartConfig != null) {
            this.maxContactCount = quickContartConfig.getCount().intValue();
        }
    }

    @NonNull
    private ContactModel buildContactModel(int i8, String str, Uri uri, int i9) {
        ContactModel contactModel = new ContactModel();
        contactModel.setName(str);
        contactModel.setAvatar(uri);
        contactModel.setCount(i8);
        contactModel.setIndex(i9);
        return contactModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ContactModel> formatContactList(List<ContactInfo> list) {
        int i8;
        ArrayList arrayList = new ArrayList();
        for (ContactInfo contactInfo : list) {
            String name = contactInfo.getName();
            List<String> removeHideContact = removeHideContact(name, contactInfo.getNumber());
            if (removeHideContact != null && !removeHideContact.isEmpty()) {
                Uri avatarUrl = contactInfo.getAvatarUrl();
                int size = removeHideContact.size();
                if (1 < size) {
                    arrayList.add(buildContactModel(size, name, avatarUrl, 0));
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                for (int i9 = 0; i9 < size; i9++) {
                    String str = removeHideContact.get(i9);
                    ContactModel buildContactModel = buildContactModel(size, name, avatarUrl, i8);
                    buildContactModel.setNumber(str);
                    buildContactModel.setCheched(isSavedContact(name, str));
                    arrayList.add(buildContactModel);
                    i8++;
                }
            }
        }
        return arrayList;
    }

    private int getSelectedContactCount(List<Contact> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private boolean isSavedContact(String str, String str2) {
        List<Contact> list = this.selectedContactList;
        if (list != null && !list.isEmpty()) {
            for (Contact contact : this.selectedContactList) {
                if (TextUtils.equals(str, contact.getName()) && TextUtils.equals(str2, contact.getNumber())) {
                    return true;
                }
            }
        }
        return false;
    }

    private List<String> removeHideContact(String str, List<String> list) {
        List<Contact> list2 = this.hideContactList;
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Contact contact : this.hideContactList) {
                if (TextUtils.equals(str, contact.getName())) {
                    for (String str2 : list) {
                        if (TextUtils.equals(str2, contact.getNumber())) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.remove((String) it.next());
                }
            }
        }
        return list;
    }

    private void removeSelectedContact(String str) {
        int i8 = 0;
        while (true) {
            if (i8 >= this.selectedContactList.size()) {
                i8 = -1;
                break;
            } else if (TextUtils.equals(this.selectedContactList.get(i8).getNumber(), str)) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            this.selectedContactList.remove(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAllContact(List<ContactModel> list) {
        this.view.renderContactList(list);
    }

    private void showSelectedContactCount(List<Contact> list) {
        this.view.renderSeleceContactCount(getSelectedContactCount(list));
    }

    public void addContact(ContactModel contactModel, Bitmap bitmap) {
        String number = contactModel.getNumber();
        if (TextUtils.isEmpty(number)) {
            return;
        }
        if (contactModel.isCheched()) {
            contactModel.setCheched(false);
            removeSelectedContact(number);
        } else {
            int i8 = TextUtils.isEmpty(this.selectedContactNumber) ? this.maxContactCount : 1;
            if (i8 <= getSelectedContactCount(this.selectedContactList)) {
                this.view.renderMaxSelectContactCountHint(i8);
                return;
            }
            contactModel.setCheched(true);
            Contact contact = new Contact();
            contact.setName(contactModel.getName());
            contact.setNumber(number);
            if (bitmap != null) {
                File file = new File(com.crrepa.band.my.a.getTempContactAvatarPath(String.valueOf(contact.getName().hashCode())));
                g.saveBitmap(bitmap, file);
                contact.setAvatar(file.getAbsolutePath());
                if (TextUtils.equals(this.selectedContactNumber, number)) {
                    org.greenrobot.eventbus.c.getDefault().post(new ContactAvatarChangeEvent());
                }
            }
            this.selectedContactList.add(contact);
        }
        showSelectedContactCount(this.selectedContactList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getAllContact(Context context, List<Contact> list, String str) {
        Contact contact;
        if (!TextUtils.isEmpty(str)) {
            this.selectedContactNumber = str;
            this.selectedContactList.clear();
            Iterator<Contact> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    contact = null;
                    break;
                } else {
                    contact = it.next();
                    if (TextUtils.equals(contact.getNumber(), str)) {
                        break;
                    }
                }
            }
            if (contact != null) {
                this.selectedContactList.add(contact);
                list.remove(contact);
            }
            this.hideContactList = list;
        } else if (list != null) {
            this.selectedContactList = list;
        }
        showSelectedContactCount(this.selectedContactList);
        Observable.create(new c(context)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(), new C0175b());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveSelectedContact() {
        this.view.renderSelectedContactList(new ArrayList<>(this.selectedContactList), this.selectedContactNumber);
    }

    public void setView(x0.b bVar) {
        this.view = bVar;
    }
}
