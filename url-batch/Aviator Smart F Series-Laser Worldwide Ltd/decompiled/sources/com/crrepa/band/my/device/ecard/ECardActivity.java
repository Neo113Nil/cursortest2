package com.crrepa.band.my.device.ecard;

import android.content.Context;
import android.content.Intent;
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
import com.crrepa.band.my.databinding.ActivityEcardBinding;
import com.crrepa.band.my.device.ecard.adapter.ECardAdapter;
import com.crrepa.band.my.model.db.ECard;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.decoration.RecycleItemDivider;
import com.yanzhenjie.recyclerview.j;
import com.yanzhenjie.recyclerview.k;
import com.yanzhenjie.recyclerview.l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ECardActivity extends BaseVBActivity<ActivityEcardBinding> implements f1.a, OnItemClickListener {
    public static final int ECARD_REQUEST_CODE = 16;
    private View footerView;
    private final com.crrepa.band.my.device.ecard.presenter.a presenter = new com.crrepa.band.my.device.ecard.presenter.a();
    private final ECardAdapter eCardAdapter = new ECardAdapter();
    private t5.a itemMoveListener = new a();
    private t5.c itemStateChangedListener = new b();
    private k swipeMenuCreator = new c();
    private com.yanzhenjie.recyclerview.g menuItemClickListener = new d();

    class a implements t5.a {
        a() {
        }

        @Override // t5.a
        public void onItemDismiss(RecyclerView.ViewHolder viewHolder) {
        }

        @Override // t5.a
        public boolean onItemMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition() - ((ActivityEcardBinding) ((BaseVBActivity) ECardActivity.this).binding).rcvEcardList.getHeaderCount();
            int adapterPosition2 = viewHolder2.getAdapterPosition() - ((ActivityEcardBinding) ((BaseVBActivity) ECardActivity.this).binding).rcvEcardList.getHeaderCount();
            Collections.swap(ECardActivity.this.eCardAdapter.getData(), adapterPosition, adapterPosition2);
            ECardActivity.this.eCardAdapter.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }
    }

    class b implements t5.c {
        b() {
        }

        @Override // t5.c
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i8) {
            com.orhanobut.logger.f.d("onSelectedChanged: " + i8);
            ((ActivityEcardBinding) ((BaseVBActivity) ECardActivity.this).binding).rcvEcardList.smoothCloseMenu();
            if (i8 == 2) {
                viewHolder.itemView.setBackgroundColor(ContextCompat.getColor(ECardActivity.this, R.color.light_gray));
            } else if (i8 != 1 && i8 == 0) {
                ViewCompat.setBackground(viewHolder.itemView, ContextCompat.getDrawable(ECardActivity.this, R.drawable.selector_item_contact));
                ECardActivity.this.sendECardList();
            }
        }
    }

    class c implements k {
        c() {
        }

        @Override // com.yanzhenjie.recyclerview.k
        public void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
            iVar2.addMenuItem(new l(ECardActivity.this).setBackgroundColor(ContextCompat.getColor(ECardActivity.this, R.color.color_swipe_menu_item_bg)).setImage(R$drawable.ic_delete).setWidth(ECardActivity.this.getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
        }
    }

    class d implements com.yanzhenjie.recyclerview.g {
        d() {
        }

        @Override // com.yanzhenjie.recyclerview.g
        public void onItemClick(j jVar, int i8) {
            jVar.closeMenu();
            ECardActivity.this.delete(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delete(int i8) {
        this.presenter.delete(i8, this.eCardAdapter.getData().get(i8).getId().longValue());
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) ECardActivity.class);
    }

    private void initECardList() {
        ((ActivityEcardBinding) this.binding).rcvEcardList.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityEcardBinding) this.binding).rcvEcardList.setLongPressDragEnabled(true);
        ((ActivityEcardBinding) this.binding).rcvEcardList.setOnItemStateChangedListener(this.itemStateChangedListener);
        ((ActivityEcardBinding) this.binding).rcvEcardList.setOnItemMoveListener(this.itemMoveListener);
        ((ActivityEcardBinding) this.binding).rcvEcardList.setSwipeMenuCreator(this.swipeMenuCreator);
        ((ActivityEcardBinding) this.binding).rcvEcardList.setOnItemMenuClickListener(this.menuItemClickListener);
        View inflate = getLayoutInflater().inflate(R.layout.footer_quick_contact, (ViewGroup) ((ActivityEcardBinding) this.binding).rcvEcardList, false);
        this.footerView = inflate;
        inflate.findViewById(R.id.iv_add_contact).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ecard.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECardActivity.this.lambda$initECardList$2(view);
            }
        });
        RecycleItemDivider recycleItemDivider = new RecycleItemDivider(this, 1, o.dp2px(this, 0.5f), ContextCompat.getColor(this, R.color.color_line_bg));
        recycleItemDivider.setHideLastDivider(true);
        ((ActivityEcardBinding) this.binding).rcvEcardList.addItemDecoration(recycleItemDivider);
        ((ActivityEcardBinding) this.binding).rcvEcardList.setAdapter(this.eCardAdapter);
        this.eCardAdapter.setOnItemClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initECardList$2(View view) {
        ((ActivityEcardBinding) this.binding).btnAddEcard.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        startActivityForResult(ECardEditActivity.getCallingIntent(this), 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendECardList() {
        this.presenter.sendECardList(this.eCardAdapter.getData());
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityEcardBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityEcardBinding) vb).includeTitle.tvTitle, ((ActivityEcardBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityEcardBinding) this.binding).includeTitle.toolbar);
    }

    private void setTitle() {
        ((ActivityEcardBinding) this.binding).includeTitle.tvTitle.setText(R.string.e_card);
        ((ActivityEcardBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.e_card);
        ((ActivityEcardBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        initECardList();
        this.presenter.getECardList(false);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityEcardBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ecard.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECardActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityEcardBinding) this.binding).btnAddEcard.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ecard.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ECardActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (-1 == i9) {
            this.presenter.getECardList(true);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        startActivityForResult(ECardEditActivity.getCallingIntent(this, ((ECard) baseQuickAdapter.getData().get(i8)).getId().longValue()), 16);
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
        s0.logPage(getClass(), "电子名片");
    }

    @Override // f1.a
    public void renderAddECardVisable(boolean z7) {
        if (!z7) {
            ((ActivityEcardBinding) this.binding).rcvEcardList.removeFooterView(this.footerView);
        } else if (((ActivityEcardBinding) this.binding).rcvEcardList.getFooterCount() <= 0) {
            ((ActivityEcardBinding) this.binding).rcvEcardList.addFooterView(this.footerView);
        }
    }

    @Override // f1.a
    public void renderDeleteECard(int i8, boolean z7) {
        if (z7) {
            this.eCardAdapter.remove(i8);
        } else {
            r0.showLong(this, getString(R.string.band_setting_send_fail));
        }
        if (this.eCardAdapter.getData().isEmpty()) {
            renderECardListVisable(false);
        } else {
            renderAddECardVisable(true);
        }
    }

    @Override // f1.a
    public void renderECardList(List<ECard> list, int i8) {
        renderECardListVisable(true);
        this.eCardAdapter.setNewData(list);
        renderAddECardVisable(list.size() < i8);
    }

    @Override // f1.a
    public void renderECardListVisable(boolean z7) {
        if (z7) {
            ((ActivityEcardBinding) this.binding).llEmptyEcard.setVisibility(8);
            ((ActivityEcardBinding) this.binding).rcvEcardList.setVisibility(0);
        } else {
            ((ActivityEcardBinding) this.binding).llEmptyEcard.setVisibility(0);
            ((ActivityEcardBinding) this.binding).rcvEcardList.setVisibility(8);
        }
    }

    @Override // f1.a
    public void renderNewECard(ECard eCard) {
        renderECardListVisable(true);
        this.eCardAdapter.addData(eCard);
    }
}
