package com.crrepa.band.my.device.contact.presenter;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BandQuickContactProvider;
import com.crrepa.band.my.model.db.Contact;
import com.crrepa.band.my.model.db.QuickContartConfig;
import com.crrepa.band.my.model.db.proxy.ContactDaoProxy;
import com.crrepa.band.my.model.db.proxy.QuickContartConfigDaoProxy;
import com.crrepa.ble.conn.bean.CRPContactInfo;
import com.crrepa.ble.conn.callback.CRPContactCountCallback;
import com.crrepa.ble.conn.callback.CRPContactNumberSymbolCallback;
import com.crrepa.ble.conn.listener.CRPContactListener;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.g;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements f {
    private static final int CONTACT_AVATAR_TIMEOUT = 30;
    private static final int DEFAULT_AVATAR_WIDTH = 40;
    private static final int TRANS_TYPE_AVATAR = 2;
    private static final int TRANS_TYPE_CONTACTS = 1;
    private int avatarHeight;
    private int avatarWidth;
    private int maxContactCount;
    private int maxNameLength;
    private List<Contact> originalContactList;
    private List<Contact> savedContactList;
    private int transType;
    private x0.a view;
    private ContactDaoProxy daoProxy = new ContactDaoProxy();
    private e contactListener = new e(this);
    private float perContactPercent = 0.0f;
    private boolean startTrans = false;
    private i4 bandSettingManager = i4.getInstance();

    /* renamed from: com.crrepa.band.my.device.contact.presenter.a$a, reason: collision with other inner class name */
    class C0173a implements CRPFileTransListener {
        final /* synthetic */ Bitmap val$avatarBitmap;
        final /* synthetic */ int val$index;

        C0173a(int i8, Bitmap bitmap) {
            this.val$index = i8;
            this.val$avatarBitmap = bitmap;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            com.orhanobut.logger.f.d("onError: " + i8);
            a.this.showUploadFail();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            com.orhanobut.logger.f.d("onTransCompleted: " + this.val$index);
            a.this.saveContactAvatar(this.val$avatarBitmap, this.val$index);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            com.orhanobut.logger.f.d("onTransProgressChanged: " + i8);
            a.this.showUploadProgress(this.val$index, i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
        }
    }

    class b implements Consumer {
        final /* synthetic */ int val$index;

        b(int i8) {
            this.val$index = i8;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            a.this.sendContactInfo(this.val$index);
        }
    }

    class c implements CRPContactCountCallback {

        /* renamed from: com.crrepa.band.my.device.contact.presenter.a$c$a, reason: collision with other inner class name */
        class C0174a implements Consumer {
            C0174a() {
            }

            @Override // io.reactivex.functions.Consumer
            public void accept(Integer num) {
                a.this.clearContacts();
                a.this.getSavedContactList();
            }
        }

        c() {
        }

        @Override // com.crrepa.ble.conn.callback.CRPContactCountCallback
        @SuppressLint({"CheckResult"})
        public void onContactCount(int i8) {
            com.orhanobut.logger.f.d("onContactCount: " + i8);
            if (i8 == 0) {
                Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0174a());
            }
        }
    }

    class d implements CRPContactNumberSymbolCallback {
        d() {
        }

        @Override // com.crrepa.ble.conn.callback.CRPContactNumberSymbolCallback
        public void onSupportSymbol(boolean z7) {
            com.orhanobut.logger.f.d("onSupportSymbol: " + z7);
            BandQuickContactProvider.saveSupportSymbol(z7);
        }
    }

    private class e implements CRPContactListener {
        private WeakReference<a> weakReference;

        public e(a aVar) {
            this.weakReference = new WeakReference<>(aVar);
        }

        private void saveSendResult(int i8, boolean z7) {
            com.orhanobut.logger.f.d("saveSendResult: " + i8 + " - " + z7);
            a aVar = this.weakReference.get();
            if (i8 < 0 || aVar == null) {
                return;
            }
            if (!z7) {
                a.this.showUploadFail();
                return;
            }
            int i9 = aVar.transType;
            if (i9 == 1) {
                aVar.sendContactAvatar(i8);
            } else {
                if (i9 != 2) {
                    return;
                }
                a.this.delaySendContact(i8 + 1);
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPContactListener
        public void onSavedFail(int i8) {
            saveSendResult(i8, false);
        }

        @Override // com.crrepa.ble.conn.listener.CRPContactListener
        public void onSavedSuccess(int i8) {
            saveSendResult(i8, true);
        }
    }

    public a() {
        this.avatarWidth = 40;
        this.avatarHeight = 40;
        this.maxContactCount = 8;
        org.greenrobot.eventbus.c.getDefault().register(this);
        QuickContartConfig quickContartConfig = new QuickContartConfigDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (quickContartConfig != null) {
            this.avatarWidth = quickContartConfig.getWidth().intValue();
            this.avatarHeight = quickContartConfig.getHeight().intValue();
            this.maxContactCount = quickContartConfig.getCount().intValue();
            this.maxNameLength = quickContartConfig.getMaxNameLength().intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContacts() {
        this.daoProxy.deleteAll();
        List<Contact> list = this.originalContactList;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void delaySendContact(int i8) {
        Observable.timer(500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSavedContactList() {
        if (this.view != null) {
            List<Contact> all = this.daoProxy.getAll();
            this.originalContactList = all;
            this.view.renderContactList(all);
        }
    }

    private void queryContactCount() {
        i4.getInstance().queryContactCount(new c());
    }

    private void queryContactNumberSymbol() {
        i4.getInstance().queryContactNumberSymbol(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveContactAvatar(Bitmap bitmap, int i8) {
        Contact contact = this.savedContactList.get(i8);
        File file = new File(com.crrepa.band.my.a.getContactAvatarPath(String.valueOf(contact.getName().hashCode())));
        g.saveBitmap(bitmap, file);
        contact.setAvatar(file.getAbsolutePath());
        this.savedContactList.set(i8, contact);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendContactAvatar(int i8) {
        int i9 = this.avatarHeight;
        int i10 = this.avatarWidth;
        if (i9 == i10 && i10 == 0) {
            delaySendContact(i8 + 1);
            return;
        }
        File file = new File(this.savedContactList.get(i8).getAvatar());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath(), options);
        com.orhanobut.logger.f.d("sendContactAvatar: " + i8);
        int i11 = this.avatarWidth;
        int i12 = this.avatarHeight;
        Bitmap roundBitmap = g.getRoundBitmap(decodeFile, i11, i12, i12 / 2);
        com.orhanobut.logger.f.d("compressBitmap: " + roundBitmap.getWidth());
        this.transType = 2;
        this.bandSettingManager.sendContactAvatar(i8, roundBitmap, 30, new C0173a(i8, decodeFile));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendContactInfo(int i8) {
        if (this.savedContactList.size() <= i8) {
            showUploadComplete();
            return;
        }
        Contact contact = this.savedContactList.get(i8);
        CRPContactInfo cRPContactInfo = new CRPContactInfo();
        cRPContactInfo.setAddress(0);
        cRPContactInfo.setHeight(this.avatarHeight);
        cRPContactInfo.setWidth(this.avatarWidth);
        cRPContactInfo.setId(i8);
        cRPContactInfo.setName(contact.getName());
        cRPContactInfo.setNumber(contact.getNumber());
        int i9 = this.maxNameLength;
        if (i9 > 0) {
            cRPContactInfo.setMaxNameLength(i9);
        }
        this.transType = 1;
        this.bandSettingManager.sendContact(cRPContactInfo);
    }

    private void showUploadComplete() {
        this.startTrans = false;
        this.view.renderUploadProgress(100);
        this.view.renderUploadSuccess();
        this.daoProxy.deleteAll();
        for (int i8 = 0; i8 < this.savedContactList.size(); i8++) {
            Contact contact = this.savedContactList.get(i8);
            contact.setId(Long.valueOf(i8));
            this.daoProxy.insert(contact);
        }
        this.originalContactList = new ArrayList(this.savedContactList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUploadFail() {
        if (this.view != null) {
            clearContacts();
            this.bandSettingManager.clearContact();
            this.view.renderUploadFail();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showUploadProgress(int i8, int i9) {
        this.view.renderUploadProgress((int) ((i8 + (i9 / 100.0f)) * this.perContactPercent));
    }

    public void checkContactListChanged(List<Contact> list) {
        List<Contact> list2 = this.originalContactList;
        boolean z7 = false;
        if (list == list2) {
            this.view.renderContactListChanged(false);
            return;
        }
        int size = list2 == null ? 0 : list2.size();
        int size2 = list == null ? 0 : list.size();
        com.orhanobut.logger.f.d("originalSize: " + size);
        com.orhanobut.logger.f.d("size: " + size2);
        if (size != size2) {
            this.view.renderContactListChanged(true);
            return;
        }
        if (size == 0) {
            this.view.renderContactListChanged(false);
            return;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.originalContactList.size()) {
                break;
            }
            if (!this.originalContactList.get(i8).equals(list.get(i8))) {
                z7 = true;
                break;
            }
            i8++;
        }
        this.view.renderContactListChanged(z7);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getContactList() {
        getSavedContactList();
        queryContactCount();
        queryContactNumberSymbol();
        this.view.renderMaxContactCount(this.maxContactCount);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        if (this.startTrans && aVar.getState() == 0) {
            showUploadFail();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveContact(List<Contact> list) {
        com.orhanobut.logger.f.d("saveContact");
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            this.view.renderBandDisconnected();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            this.view.renderLowBatteryHint();
            return;
        }
        this.bandSettingManager.clearContact();
        this.savedContactList = list;
        this.view.renderStartUploadContact();
        if (list == null || list.isEmpty()) {
            clearContacts();
            this.view.renderUploadSuccess();
        } else {
            this.perContactPercent = 100.0f / list.size();
            this.bandSettingManager.setContactListener(this.contactListener);
            this.startTrans = true;
            delaySendContact(0);
        }
    }

    public void setView(x0.a aVar) {
        this.view = aVar;
    }
}
