package com.crrepa.band.my.device.worldclock;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityWorldClockBinding;
import com.crrepa.band.my.device.worldclock.adapter.AddedClockAdapter;
import com.crrepa.band.my.device.worldclock.model.WorldClockConvert;
import com.crrepa.band.my.home.health.model.SystemDateChangeEvent;
import com.crrepa.band.my.model.WorldClockModel;
import com.crrepa.band.my.model.db.WorldClock;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import com.yanzhenjie.recyclerview.k;
import com.yanzhenjie.recyclerview.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class WorldClockActivity extends BaseVBActivity<ActivityWorldClockBinding> implements f2.b {
    private static final int REQUEST_CODE = 1;
    private final d2.e presenter = new d2.e();
    private final AddedClockAdapter clockAdapter = new AddedClockAdapter();
    private ArrayList<WorldClock> clockList = new ArrayList<>();
    private final ArrayList<Integer> clockIds = new ArrayList<>();
    private final t5.a itemMoveListener = new a();
    private final t5.c itemStateChangedListener = new b();
    private final k swipeMenuCreator = new c();
    private final com.yanzhenjie.recyclerview.g menuItemClickListener = new d();

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
            int adapterPosition = viewHolder.getAdapterPosition() - ((ActivityWorldClockBinding) ((BaseVBActivity) WorldClockActivity.this).binding).rcvClockList.getHeaderCount();
            int adapterPosition2 = viewHolder2.getAdapterPosition() - ((ActivityWorldClockBinding) ((BaseVBActivity) WorldClockActivity.this).binding).rcvClockList.getHeaderCount();
            Collections.swap(WorldClockActivity.this.clockList, adapterPosition, adapterPosition2);
            WorldClockActivity.this.clockAdapter.notifyItemMoved(adapterPosition, adapterPosition2);
            WorldClockActivity.this.presenter.updateClockList(WorldClockActivity.this.clockList);
            return true;
        }
    }

    class b implements t5.c {
        b() {
        }

        @Override // t5.c
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i8) {
            ((ActivityWorldClockBinding) ((BaseVBActivity) WorldClockActivity.this).binding).rcvClockList.smoothCloseMenu();
            if (i8 == 2) {
                viewHolder.itemView.setBackgroundColor(ContextCompat.getColor(WorldClockActivity.this, R.color.light_gray));
            } else if (i8 != 1 && i8 == 0) {
                ViewCompat.setBackground(viewHolder.itemView, ContextCompat.getDrawable(WorldClockActivity.this, R.drawable.selector_item_contact));
            }
        }
    }

    class c implements k {
        c() {
        }

        @Override // com.yanzhenjie.recyclerview.k
        public void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
            iVar2.addMenuItem(new l(WorldClockActivity.this).setBackgroundColor(ContextCompat.getColor(WorldClockActivity.this, R.color.color_delete_text)).setText(R.string.remove).setTextColor(ContextCompat.getColor(WorldClockActivity.this, R.color.white)).setTextSize(14).setWidth(WorldClockActivity.this.getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
        }
    }

    class d implements com.yanzhenjie.recyclerview.g {
        d() {
        }

        @Override // com.yanzhenjie.recyclerview.g
        public void onItemClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
            jVar.closeMenu();
            WorldClockActivity.this.delete(i8);
        }
    }

    private int addWorldClockId() {
        int i8 = 1;
        for (int i9 = 1; i9 < this.clockIds.size() + 1; i9++) {
            if (!this.clockIds.contains(Integer.valueOf(i9))) {
                return i9;
            }
            i8++;
        }
        return i8;
    }

    private void checkClockListChanged() {
        if (this.clockList.isEmpty()) {
            ((ActivityWorldClockBinding) this.binding).rlEmpty.setVisibility(0);
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setVisibility(8);
        } else {
            ((ActivityWorldClockBinding) this.binding).rlEmpty.setVisibility(8);
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setVisibility(0);
        }
        if (this.clockList.isEmpty() || this.clockList.size() >= com.crrepa.band.my.device.worldclock.a.getWorldClockNumber()) {
            ((ActivityWorldClockBinding) this.binding).appbar.tvEdit.setVisibility(8);
        } else {
            ((ActivityWorldClockBinding) this.binding).appbar.tvEdit.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delete(int i8) {
        WorldClock worldClock = this.clockList.get(i8);
        int intValue = worldClock.getClockId().intValue();
        this.clockList.remove(i8);
        this.clockIds.remove(Integer.valueOf(intValue));
        this.clockAdapter.notifyItemRemoved(i8);
        this.presenter.deleteClock(worldClock);
        checkClockListChanged();
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) WorldClockActivity.class);
    }

    private void initScrollingTitle() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityWorldClockBinding) this.binding).appbar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityWorldClockBinding) vb).appbar.tvTitle, ((ActivityWorldClockBinding) vb).appbar.tvExpandedTitle);
        setSupportActionBar(((ActivityWorldClockBinding) this.binding).appbar.toolbar);
        ((ActivityWorldClockBinding) this.binding).appbar.tvTitle.setText(R.string.world_clock_title);
        ((ActivityWorldClockBinding) this.binding).appbar.tvExpandedTitle.setText(R.string.world_clock_title);
        ((ActivityWorldClockBinding) this.binding).appbar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityWorldClockBinding) this.binding).appbar.tvEdit.setText(R.string.add_pills);
        ((ActivityWorldClockBinding) this.binding).appbar.tvEdit.setTextColor(ContextCompat.getColor(this, R.color.main));
        ((ActivityWorldClockBinding) this.binding).appbar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.worldclock.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.this.lambda$initScrollingTitle$1(view);
            }
        });
        ((ActivityWorldClockBinding) this.binding).appbar.tvEdit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.worldclock.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.this.lambda$initScrollingTitle$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        ((ActivityWorldClockBinding) this.binding).rcvClockList.smoothCloseMenu();
        startSelectClockActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$2(View view) {
        ((ActivityWorldClockBinding) this.binding).rcvClockList.smoothCloseMenu();
        startSelectClockActivity();
    }

    private void setClockList(List<WorldClock> list) {
        if (((ActivityWorldClockBinding) this.binding).rcvClockList.getAdapter() == null) {
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setLayoutManager(new LinearLayoutManager(this));
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setLongPressDragEnabled(true);
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setOnItemStateChangedListener(this.itemStateChangedListener);
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setOnItemMoveListener(this.itemMoveListener);
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setSwipeMenuCreator(this.swipeMenuCreator);
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setOnItemMenuClickListener(this.menuItemClickListener);
            ((ActivityWorldClockBinding) this.binding).rcvClockList.setAdapter(this.clockAdapter);
        }
        ArrayList<WorldClock> arrayList = new ArrayList<>(list);
        this.clockList = arrayList;
        this.clockAdapter.setNewData(arrayList);
        this.clockIds.clear();
        for (int i8 = 0; i8 < this.clockList.size(); i8++) {
            this.clockIds.add(this.clockList.get(i8).getClockId());
        }
        checkClockListChanged();
    }

    private void startSelectClockActivity() {
        startActivityForResult(SelectClockActivity.getCallingIntent(this), 1);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        e2.b.checkSavedWorldClockTimeZone();
        this.presenter.setView(this);
        initScrollingTitle();
        renderMaxClockCount();
        ((ActivityWorldClockBinding) this.binding).shadowAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.worldclock.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, @Nullable Intent intent) {
        WorldClockModel worldClockModel;
        super.onActivityResult(i8, i9, intent);
        if (i9 != -1 || (worldClockModel = (WorldClockModel) intent.getSerializableExtra(BaseParamNames.WORLD_CLOCK_ENTITY)) == null) {
            return;
        }
        WorldClock convertWorldClock = WorldClockConvert.convertWorldClock(worldClockModel);
        if (this.clockList.contains(convertWorldClock) || !com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            return;
        }
        int addWorldClockId = addWorldClockId();
        com.orhanobut.logger.f.d("id: " + addWorldClockId);
        convertWorldClock.setClockId(Integer.valueOf(addWorldClockId));
        this.clockIds.add(Integer.valueOf(addWorldClockId));
        this.clockList.add(convertWorldClock);
        renderClockList(this.clockList);
        this.presenter.addClock(convertWorldClock);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(SystemDateChangeEvent systemDateChangeEvent) {
        this.presenter.getSavedClockList();
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
        s0.logPage(getClass(), "世界时钟");
    }

    @Override // f2.b
    public void renderBandConnected() {
        renderMaxClockCount();
        ((ActivityWorldClockBinding) this.binding).tvConnectHint.setVisibility(8);
    }

    @Override // f2.b
    public void renderBandDisconnected() {
        ((ActivityWorldClockBinding) this.binding).tvConnectHint.setVisibility(0);
        ((ActivityWorldClockBinding) this.binding).appbar.tvEdit.setVisibility(8);
        ((ActivityWorldClockBinding) this.binding).tvClockMaxNumber.setVisibility(8);
        ((ActivityWorldClockBinding) this.binding).rcvClockList.setVisibility(8);
        ((ActivityWorldClockBinding) this.binding).rlEmpty.setVisibility(8);
    }

    @Override // f2.b
    public void renderClockList(List<WorldClock> list) {
        setClockList(list);
    }

    public void renderMaxClockCount() {
        ((ActivityWorldClockBinding) this.binding).tvClockMaxNumber.setVisibility(0);
        ((ActivityWorldClockBinding) this.binding).tvClockMaxNumber.setText(getString(R.string.world_clock_subtitle, String.valueOf(com.crrepa.band.my.device.worldclock.a.getWorldClockNumber())));
    }
}
