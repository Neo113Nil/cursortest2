package com.linecorp.linesdk.dialog.internal;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.dialog.internal.TargetListAdapter;
import com.linecorp.linesdk.dialog.internal.TargetUser;
import com.squareup.picasso.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TargetListAdapter extends RecyclerView.h {
    private OnSelectedChangeListener externalListener;
    private List<TargetUser> originalTargetList;
    private String queryString = "";
    private OnSelectedChangeListener listener = new OnSelectedChangeListener() { // from class: com.linecorp.linesdk.dialog.internal.TargetListAdapter.2
        @Override // com.linecorp.linesdk.dialog.internal.TargetListAdapter.OnSelectedChangeListener
        public void onSelected(TargetUser targetUser, boolean z4) {
            TargetListAdapter.this.externalListener.onSelected(targetUser, z4);
        }
    };
    private List<TargetUser> targetList = new ArrayList<TargetUser>() { // from class: com.linecorp.linesdk.dialog.internal.TargetListAdapter.1
        {
            addAll(TargetListAdapter.this.originalTargetList);
        }
    };

    public interface OnSelectedChangeListener {
        void onSelected(TargetUser targetUser, boolean z4);
    }

    public class TargetViewHolder extends RecyclerView.E {
        private CheckBox checkBox;
        private int highlightTextColor;
        private ImageView imageView;
        private TextView textView;
        private ViewGroup viewContainer;

        public TargetViewHolder(ViewGroup viewGroup) {
            super(viewGroup);
            this.viewContainer = viewGroup;
            this.textView = (TextView) viewGroup.findViewById(R.id.textView);
            this.imageView = (ImageView) viewGroup.findViewById(R.id.imageView);
            this.checkBox = (CheckBox) viewGroup.findViewById(R.id.checkBox);
            this.highlightTextColor = viewGroup.getResources().getColor(R.color.text_highlight);
        }

        public static /* synthetic */ void c(TargetViewHolder targetViewHolder, TargetUser targetUser, OnSelectedChangeListener onSelectedChangeListener, View view) {
            targetViewHolder.getClass();
            boolean z4 = !targetUser.getSelected().booleanValue();
            targetViewHolder.viewContainer.setSelected(z4);
            targetUser.setSelected(Boolean.valueOf(z4));
            targetViewHolder.checkBox.setChecked(z4);
            onSelectedChangeListener.onSelected(targetUser, z4);
        }

        private SpannableString createHighlightTextSpan(String str, String str2) {
            int indexOf;
            SpannableString spannableString = new SpannableString(str);
            if (!str2.isEmpty() && (indexOf = str.toLowerCase().indexOf(str2.toLowerCase())) != -1) {
                spannableString.setSpan(new ForegroundColorSpan(this.highlightTextColor), indexOf, str2.length() + indexOf, 0);
            }
            return spannableString;
        }

        public void bind(final TargetUser targetUser, final OnSelectedChangeListener onSelectedChangeListener) {
            this.viewContainer.setSelected(targetUser.getSelected().booleanValue());
            this.checkBox.setChecked(targetUser.getSelected().booleanValue());
            this.textView.setText(createHighlightTextSpan(targetUser.getDisplayName(), TargetListAdapter.this.queryString));
            this.viewContainer.setOnClickListener(new View.OnClickListener() { // from class: com.linecorp.linesdk.dialog.internal.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TargetListAdapter.TargetViewHolder.c(TargetListAdapter.TargetViewHolder.this, targetUser, onSelectedChangeListener, view);
                }
            });
            q.g().i(targetUser.getPictureUri()).f(targetUser.getType() == TargetUser.Type.FRIEND ? R.drawable.friend_thumbnail : R.drawable.group_thumbnail).d(this.imageView);
        }
    }

    public TargetListAdapter(List<TargetUser> list, OnSelectedChangeListener onSelectedChangeListener) {
        this.originalTargetList = list;
        this.externalListener = onSelectedChangeListener;
    }

    public void addAll(List<TargetUser> list) {
        int size = this.targetList.size() - 1;
        this.originalTargetList.addAll(list);
        this.targetList.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    public int filter(String str) {
        this.queryString = str;
        this.targetList.clear();
        if (str.isEmpty()) {
            this.targetList.addAll(this.originalTargetList);
        } else {
            String lowerCase = str.toLowerCase();
            for (TargetUser targetUser : this.originalTargetList) {
                if (targetUser.getDisplayName().toLowerCase().contains(lowerCase)) {
                    this.targetList.add(targetUser);
                }
            }
        }
        notifyDataSetChanged();
        return this.targetList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.targetList.size();
    }

    public void unSelect(TargetUser targetUser) {
        for (int i4 = 0; i4 < this.targetList.size(); i4++) {
            TargetUser targetUser2 = this.targetList.get(i4);
            if (targetUser2.getId().equals(targetUser.getId())) {
                targetUser2.setSelected(Boolean.FALSE);
                notifyItemChanged(i4);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(TargetViewHolder targetViewHolder, int i4) {
        targetViewHolder.bind(this.targetList.get(i4), this.listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public TargetViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new TargetViewHolder((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_target_item, viewGroup, false));
    }
}
