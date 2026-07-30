package com.crrepa.band.my.device.cricket.adapter;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.CricketTeamModel;
import com.crrepa.band.my.model.db.proxy.CricketTeamDaoProxy;
import java.util.List;

/* loaded from: classes2.dex */
public class CWCTeamsAdapter extends BaseQuickAdapter<CricketTeamModel, BaseViewHolder> {
    private a onTeamCheckedChangeListener;

    public interface a {
        void onCheckedChange(CompoundButton compoundButton, boolean z7, CricketTeamModel cricketTeamModel);
    }

    public CWCTeamsAdapter(@Nullable List<CricketTeamModel> list) {
        super(R.layout.item_cwc_team, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$0(CricketTeamModel cricketTeamModel, CompoundButton compoundButton, boolean z7) {
        a aVar = this.onTeamCheckedChangeListener;
        if (aVar != null) {
            aVar.onCheckedChange(compoundButton, z7, cricketTeamModel);
        }
    }

    public void setOnTeamCheckedChangeListener(a aVar) {
        this.onTeamCheckedChangeListener = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, final CricketTeamModel cricketTeamModel) {
        String name = cricketTeamModel.getName();
        baseViewHolder.setText(R.id.tv_team_name, name);
        baseViewHolder.setImageResource(R.id.iv_flag, CricketTeamDaoProxy.getTeamIcon(name));
        CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.cb_select);
        checkBox.setChecked(cricketTeamModel.getSelected().booleanValue());
        if (getItemPosition(cricketTeamModel) == getItemCount() - 1) {
            baseViewHolder.setGone(R.id.border, true);
        } else {
            baseViewHolder.setVisible(R.id.border, true);
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.cricket.adapter.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                CWCTeamsAdapter.this.lambda$convert$0(cricketTeamModel, compoundButton, z7);
            }
        });
    }
}
