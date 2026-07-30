package com.crrepa.band.my.device.contact;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityQuickContactBinding;
import com.crrepa.band.my.device.contact.adapter.QuickContactAdapter;
import com.crrepa.band.my.model.db.Contact;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.decoration.RecycleItemDivider;
import com.yanzhenjie.recyclerview.j;
import com.yanzhenjie.recyclerview.k;
import com.yanzhenjie.recyclerview.l;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class QuickContactActivity extends BaseVBActivity<ActivityQuickContactBinding> implements x0.a, OnItemClickListener {
    private static final int ADD_CONTACT_CODE = 16;
    private static final int EDIT_CONTACT_CODE = 32;
    private static final int UPLAOD_EDITABLE = 100;
    private static final int UPLAOD_NOT_EDITABLE = 0;
    private ArrayList<Contact> contactList;
    private final com.crrepa.band.my.device.contact.presenter.a presenter = new com.crrepa.band.my.device.contact.presenter.a();
    private final QuickContactAdapter contactAdapter = new QuickContactAdapter();
    private boolean contactListChanged = false;
    private boolean uploadContact = false;
    private t5.a itemMoveListener = new d();
    private t5.c itemStateChangedListener = new e();
    private k swipeMenuCreator = new f();
    private com.yanzhenjie.recyclerview.g menuItemClickListener = new g();

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            ((ActivityQuickContactBinding) ((BaseVBActivity) QuickContactActivity.this).binding).pbEditContact.setProgress(i.DOUBLE_EPSILON);
            ((ActivityQuickContactBinding) ((BaseVBActivity) QuickContactActivity.this).binding).tvEditState.setText(R.string.contact_upload_complete);
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            ((ActivityQuickContactBinding) ((BaseVBActivity) QuickContactActivity.this).binding).pbEditContact.setProgress(100.0d);
            ((ActivityQuickContactBinding) ((BaseVBActivity) QuickContactActivity.this).binding).tvEditState.setText(R.string.done);
            QuickContactActivity quickContactActivity = QuickContactActivity.this;
            r0.showLong(quickContactActivity, quickContactActivity.getString(R.string.contact_upload_fail));
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            QuickContactActivity.this.onAddContactClicked();
        }
    }

    class d implements t5.a {
        d() {
        }

        @Override // t5.a
        public void onItemDismiss(RecyclerView.ViewHolder viewHolder) {
        }

        @Override // t5.a
        public boolean onItemMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition() - ((ActivityQuickContactBinding) ((BaseVBActivity) QuickContactActivity.this).binding).rcvContactList.getHeaderCount();
            int adapterPosition2 = viewHolder2.getAdapterPosition() - ((ActivityQuickContactBinding) ((BaseVBActivity) QuickContactActivity.this).binding).rcvContactList.getHeaderCount();
            Collections.swap(QuickContactActivity.this.contactList, adapterPosition, adapterPosition2);
            QuickContactActivity.this.contactAdapter.notifyItemMoved(adapterPosition, adapterPosition2);
            QuickContactActivity.this.checkContactListChanged();
            return true;
        }
    }

    class e implements t5.c {
        e() {
        }

        @Override // t5.c
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i8) {
            ((ActivityQuickContactBinding) ((BaseVBActivity) QuickContactActivity.this).binding).rcvContactList.smoothCloseMenu();
            if (i8 == 2) {
                viewHolder.itemView.setBackgroundColor(ContextCompat.getColor(QuickContactActivity.this, R.color.light_gray));
            } else if (i8 != 1 && i8 == 0) {
                ViewCompat.setBackground(viewHolder.itemView, ContextCompat.getDrawable(QuickContactActivity.this, R.drawable.selector_item_contact));
            }
        }
    }

    class f implements k {
        f() {
        }

        @Override // com.yanzhenjie.recyclerview.k
        public void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
            iVar2.addMenuItem(new l(QuickContactActivity.this).setBackgroundColor(ContextCompat.getColor(QuickContactActivity.this, R.color.color_swipe_menu_item_bg)).setImage(R$drawable.ic_delete).setWidth(QuickContactActivity.this.getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
        }
    }

    class g implements com.yanzhenjie.recyclerview.g {
        g() {
        }

        @Override // com.yanzhenjie.recyclerview.g
        public void onItemClick(j jVar, int i8) {
            jVar.closeMenu();
            QuickContactActivity.this.delete(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkContactListChanged() {
        this.presenter.checkContactListChanged(this.contactList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delete(int i8) {
        this.contactList.remove(i8);
        this.contactAdapter.notifyItemRemoved(i8);
        checkContactListChanged();
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) QuickContactActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        onAddContactClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        onAddContactClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$3(View view) {
        onDoneClicked();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityQuickContactBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityQuickContactBinding) vb).includeTitle.tvTitle, ((ActivityQuickContactBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityQuickContactBinding) this.binding).includeTitle.toolbar);
        ((ActivityQuickContactBinding) this.binding).includeTitle.tvEdit.setText(R.string.quick_contact_reset);
    }

    private void setContactList(List<Contact> list) {
        if (((ActivityQuickContactBinding) this.binding).rcvContactList.getAdapter() == null) {
            ((ActivityQuickContactBinding) this.binding).rcvContactList.setLayoutManager(new LinearLayoutManager(this));
            ((ActivityQuickContactBinding) this.binding).rcvContactList.setLongPressDragEnabled(true);
            ((ActivityQuickContactBinding) this.binding).rcvContactList.setOnItemStateChangedListener(this.itemStateChangedListener);
            ((ActivityQuickContactBinding) this.binding).rcvContactList.setOnItemMoveListener(this.itemMoveListener);
            ((ActivityQuickContactBinding) this.binding).rcvContactList.setSwipeMenuCreator(this.swipeMenuCreator);
            ((ActivityQuickContactBinding) this.binding).rcvContactList.setOnItemMenuClickListener(this.menuItemClickListener);
            View inflate = getLayoutInflater().inflate(R.layout.footer_quick_contact, (ViewGroup) ((ActivityQuickContactBinding) this.binding).rcvContactList, false);
            inflate.findViewById(R.id.iv_add_contact).setOnClickListener(new c());
            ((ActivityQuickContactBinding) this.binding).rcvContactList.addFooterView(inflate);
            RecycleItemDivider recycleItemDivider = new RecycleItemDivider(this, 1, o.dp2px(this, 0.5f), ContextCompat.getColor(this, R.color.color_line_bg));
            recycleItemDivider.setHideLastDivider(true);
            ((ActivityQuickContactBinding) this.binding).rcvContactList.addItemDecoration(recycleItemDivider);
            ((ActivityQuickContactBinding) this.binding).rcvContactList.setAdapter(this.contactAdapter);
            this.contactAdapter.setOnItemClickListener(this);
        }
        ArrayList<Contact> arrayList = new ArrayList<>(list);
        this.contactList = arrayList;
        this.contactAdapter.setNewData(arrayList);
        checkContactListChanged();
    }

    private void setTitle() {
        ((ActivityQuickContactBinding) this.binding).includeTitle.tvTitle.setText(R.string.quick_contact);
        ((ActivityQuickContactBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.quick_contact);
        ((ActivityQuickContactBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    private void startSelectContactActivity(String str, int i8) {
        startActivityForResult(SelectContactActivity.getCallingIntent(this, this.contactList, str), i8);
    }

    private void updateSelectedContact(ArrayList<Contact> arrayList, String str) {
        int i8 = 0;
        Contact contact = (arrayList == null || arrayList.isEmpty()) ? null : arrayList.get(0);
        while (true) {
            if (i8 >= this.contactList.size()) {
                i8 = -1;
                break;
            } else if (TextUtils.equals(str, this.contactList.get(i8).getNumber())) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 < 0) {
            return;
        }
        if (contact == null) {
            this.contactList.remove(i8);
        } else {
            contact.setId(this.contactList.get(i8).getId());
            this.contactList.set(i8, contact);
        }
        renderContactList(this.contactList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        this.presenter.getContactList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityQuickContactBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.contact.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickContactActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityQuickContactBinding) this.binding).btnAddContact.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.contact.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickContactActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityQuickContactBinding) this.binding).includeTitle.tvEdit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.contact.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickContactActivity.this.lambda$initOnClickListener$2(view);
            }
        });
        ((ActivityQuickContactBinding) this.binding).rlContactDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.contact.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickContactActivity.this.lambda$initOnClickListener$3(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1) {
            ArrayList<Contact> parcelableArrayListExtra = intent.getParcelableArrayListExtra(SelectContactActivity.SELECT_CONTACT_LIST);
            com.orhanobut.logger.f.d("requestCode: " + i8);
            if (i8 == 16) {
                renderContactList(parcelableArrayListExtra);
            } else if (i8 == 32) {
                updateSelectedContact(parcelableArrayListExtra, intent.getStringExtra(SelectContactActivity.SELECTED_CONTACT_NUMBER));
            }
        }
    }

    public void onAddContactClicked() {
        if (this.uploadContact) {
            return;
        }
        startSelectContactActivity(null, 16);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (this.uploadContact) {
            return;
        }
        super.onBackPressedSupport();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    public void onDoneClicked() {
        if (!this.uploadContact && this.contactListChanged) {
            this.presenter.saveContact(this.contactList);
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        if (this.uploadContact) {
            return;
        }
        startSelectContactActivity(((Contact) baseQuickAdapter.getData().get(i8)).getNumber(), 32);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "快捷通讯");
    }

    @Override // x0.a
    public void renderBandDisconnected() {
        r0.showLong(this, getString(R.string.band_setting_send_fail));
    }

    @Override // x0.a
    public void renderContactList(List<Contact> list) {
        if ((list == null || list.isEmpty()) && ((ActivityQuickContactBinding) this.binding).rlContactList.getVisibility() == 8) {
            ((ActivityQuickContactBinding) this.binding).llEmptyContart.setVisibility(0);
            ((ActivityQuickContactBinding) this.binding).rlContactList.setVisibility(8);
            ((ActivityQuickContactBinding) this.binding).includeTitle.tvEdit.setVisibility(8);
        } else {
            ((ActivityQuickContactBinding) this.binding).llEmptyContart.setVisibility(8);
            ((ActivityQuickContactBinding) this.binding).rlContactList.setVisibility(0);
            ((ActivityQuickContactBinding) this.binding).includeTitle.tvEdit.setVisibility(0);
            setContactList(list);
        }
    }

    @Override // x0.a
    public void renderContactListChanged(boolean z7) {
        this.contactListChanged = z7;
        if (z7) {
            ((ActivityQuickContactBinding) this.binding).pbEditContact.setProgress(100.0d);
            ((ActivityQuickContactBinding) this.binding).tvEditState.setText(R.string.done);
        } else {
            ((ActivityQuickContactBinding) this.binding).pbEditContact.setProgress(i.DOUBLE_EPSILON);
            ((ActivityQuickContactBinding) this.binding).tvEditState.setText(R.string.contact_upload_hint);
        }
    }

    @Override // x0.a
    public void renderLowBatteryHint() {
        r0.showLong(this, getString(R.string.measure_low_battery_hint));
    }

    @Override // x0.a
    public void renderMaxContactCount(int i8) {
        ((ActivityQuickContactBinding) this.binding).tvQuickContactHint.setText(getString(R.string.quick_contact_hint, Integer.valueOf(i8)));
    }

    @Override // x0.a
    public void renderStartUploadContact() {
        this.uploadContact = true;
        ((ActivityQuickContactBinding) this.binding).tvEditState.setText(R.string.contact_upload);
        ((ActivityQuickContactBinding) this.binding).pbEditContact.setProgress(i.DOUBLE_EPSILON);
    }

    @Override // x0.a
    public void renderUploadFail() {
        this.uploadContact = false;
        Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    @Override // x0.a
    public void renderUploadProgress(int i8) {
        double d8 = i8;
        if (((ActivityQuickContactBinding) this.binding).pbEditContact.getProgress() < d8) {
            ((ActivityQuickContactBinding) this.binding).pbEditContact.setProgress(d8);
        }
    }

    @Override // x0.a
    public void renderUploadSuccess() {
        this.uploadContact = false;
        this.contactListChanged = false;
        Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }
}
