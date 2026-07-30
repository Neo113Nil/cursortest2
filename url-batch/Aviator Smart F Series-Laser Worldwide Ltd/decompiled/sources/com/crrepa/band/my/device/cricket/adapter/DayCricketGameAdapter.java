package com.crrepa.band.my.device.cricket.adapter;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.cricket.model.CricketGameModel;
import com.crrepa.band.my.device.cricket.model.DayCricketGameModel;

/* loaded from: classes2.dex */
public class DayCricketGameAdapter extends BaseQuickAdapter<DayCricketGameModel, BaseViewHolder> {
    private a onSubscribeClickListener;

    public interface a {
        void onSubscribeClick(CricketGameModel cricketGameModel);
    }

    public DayCricketGameAdapter() {
        super(R.layout.item_cricket_game);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        a aVar;
        CricketGameModel cricketGameModel = (CricketGameModel) baseQuickAdapter.getItem(i8);
        if (cricketGameModel == null || (aVar = this.onSubscribeClickListener) == null) {
            return;
        }
        aVar.onSubscribeClick(cricketGameModel);
    }

    public void setOnSubscribeClickListener(a aVar) {
        this.onSubscribeClickListener = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, DayCricketGameModel dayCricketGameModel) {
        baseViewHolder.setText(R.id.tv_cricket_date, dayCricketGameModel.getDateTitle());
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.rcv_game_list);
        CricketGameAdapter cricketGameAdapter = new CricketGameAdapter(dayCricketGameModel.getGames());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(cricketGameAdapter);
        cricketGameAdapter.setOnItemChildClickListener(new OnItemChildClickListener() { // from class: com.crrepa.band.my.device.cricket.adapter.b
            @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                DayCricketGameAdapter.this.lambda$convert$0(baseQuickAdapter, view, i8);
            }
        });
    }
}
