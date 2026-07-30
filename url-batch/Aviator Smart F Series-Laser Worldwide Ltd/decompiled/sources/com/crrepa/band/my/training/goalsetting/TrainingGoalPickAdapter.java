package com.crrepa.band.my.training.goalsetting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.training.model.TrainingGoalType;
import java.util.List;

/* loaded from: classes3.dex */
public class TrainingGoalPickAdapter extends RecyclerView.Adapter<a> {
    private final List<com.crrepa.band.my.training.goalsetting.widget.a> dataList;
    private final TrainingGoalType goalType;
    private final int spaceIndex = 3;

    static class a extends RecyclerView.ViewHolder {
        TextView tvContent;
        TextView tvDescription;
        View view;

        public a(View view) {
            super(view);
            this.tvContent = (TextView) view.findViewById(R.id.tv_content);
            this.tvDescription = (TextView) view.findViewById(R.id.tv_description);
            this.view = view.findViewById(R.id.pointer_unselected);
        }
    }

    public TrainingGoalPickAdapter(List<com.crrepa.band.my.training.goalsetting.widget.a> list, TrainingGoalType trainingGoalType) {
        this.dataList = list;
        this.goalType = trainingGoalType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<com.crrepa.band.my.training.goalsetting.widget.a> list = this.dataList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull a aVar, int i8) {
        List<com.crrepa.band.my.training.goalsetting.widget.a> list = this.dataList;
        if (list == null || list.size() == 0) {
            return;
        }
        if (i8 < 3 || i8 >= this.dataList.size() - 3) {
            aVar.tvContent.setText("");
            aVar.tvDescription.setText("");
            aVar.view.setVisibility(8);
        } else {
            aVar.tvContent.setText(TrainingGoalDialog.getGoalByType(this.dataList.get(i8).data, this.goalType));
            aVar.tvDescription.setText(this.dataList.get(i8).description);
            aVar.view.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_training_goal_picker, viewGroup, false));
    }
}
