package com.crrepa.band.my.device.watchface.adapter;

import android.graphics.PorterDuff;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchface.StoreWatchFaceDetailActivity;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceTagBean;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class StoreWatchFaceTagAdapter extends BaseQuickAdapter<StoreWatchFaceTagBean, BaseViewHolder> implements LoadMoreModule {

    public static class StoreWatchFaceAdapter extends BaseQuickAdapter<StoreWatchFaceBean, BaseViewHolder> {
        private final boolean circleScreen;
        private final BaseBandModel connectBand;
        private final boolean roundedRectangleScreen;

        public StoreWatchFaceAdapter() {
            super(R.layout.item_store_watch_face);
            this.connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
            this.circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
            this.roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
        }

        private void setImgRound(RoundedImageView roundedImageView) {
            roundedImageView.setColorFilter(-16777216, PorterDuff.Mode.DST_OVER);
            roundedImageView.setBorderWidth(R.dimen.watch_face_box_width);
            roundedImageView.setBorderColor(-16777216);
            if (this.circleScreen) {
                roundedImageView.setOval(true);
            } else if (this.roundedRectangleScreen) {
                roundedImageView.setCornerRadius(this.connectBand.getRoundedRadius());
            } else {
                roundedImageView.setBorderCornerRadius(this.connectBand.getRoundedRadius());
            }
        }

        private void showWatchFacePreview(String str, RoundedImageView roundedImageView) {
            setImgRound(roundedImageView);
            BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
            if (connectBand instanceof CustomizeBandModel) {
                ((CustomizeBandModel) connectBand).loadWatchFaceStorePreview(roundedImageView, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, StoreWatchFaceBean storeWatchFaceBean) {
            baseViewHolder.setText(R.id.tv_name, storeWatchFaceBean.getName());
            showWatchFacePreview(storeWatchFaceBean.getPreview(), (RoundedImageView) baseViewHolder.getView(R.id.iv_watch_face));
        }
    }

    public StoreWatchFaceTagAdapter() {
        super(R.layout.item_store_watch_face_tag);
    }

    private boolean hasWatchFaceTag(List<StoreWatchFaceTagBean> list, int i8) {
        Iterator<StoreWatchFaceTagBean> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == i8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        getContext().startActivity(StoreWatchFaceDetailActivity.getCallingIntent(getContext(), ((StoreWatchFaceBean) baseQuickAdapter.getData().get(i8)).getId()));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void addData(@NonNull Collection<? extends StoreWatchFaceTagBean> collection) {
        if (collection.isEmpty()) {
            return;
        }
        List<StoreWatchFaceTagBean> data = getData();
        if (data == null || data.isEmpty()) {
            super.addData((Collection) collection);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StoreWatchFaceTagBean storeWatchFaceTagBean : collection) {
            if (!hasWatchFaceTag(data, storeWatchFaceTagBean.getId())) {
                arrayList.add(storeWatchFaceTagBean);
            }
        }
        super.addData((Collection) arrayList);
    }

    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    @NonNull
    public BaseLoadMoreModule addLoadMoreModule(@NonNull BaseQuickAdapter<?, ?> baseQuickAdapter) {
        return new BaseLoadMoreModule(baseQuickAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, StoreWatchFaceTagBean storeWatchFaceTagBean) {
        baseViewHolder.setText(R.id.tv_name, storeWatchFaceTagBean.getTag_name());
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.rcv_watch_face);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        SpacesItemDecoration spacesItemDecoration = new SpacesItemDecoration(o.dp2px(getContext(), 1.0f));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(spacesItemDecoration);
        }
        StoreWatchFaceAdapter storeWatchFaceAdapter = new StoreWatchFaceAdapter();
        recyclerView.setAdapter(storeWatchFaceAdapter);
        storeWatchFaceAdapter.addData((Collection) storeWatchFaceTagBean.getFaces());
        storeWatchFaceAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.watchface.adapter.c
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                StoreWatchFaceTagAdapter.this.lambda$convert$0(baseQuickAdapter, view, i8);
            }
        });
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i8) {
        super.onBindViewHolder((StoreWatchFaceTagAdapter) baseViewHolder, i8);
    }
}
