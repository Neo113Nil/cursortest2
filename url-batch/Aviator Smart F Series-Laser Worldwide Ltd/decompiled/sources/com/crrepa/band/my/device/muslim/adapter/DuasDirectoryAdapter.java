package com.crrepa.band.my.device.muslim.adapter;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.model.DuasChapter;
import com.crrepa.band.my.device.muslim.model.DuasSection;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class DuasDirectoryAdapter extends GroupedRecyclerViewAdapter {
    protected ArrayList<DuasChapter> chapters;

    public DuasDirectoryAdapter(Context context, ArrayList<DuasChapter> arrayList) {
        super(context);
        this.chapters = arrayList;
    }

    public void clear() {
        this.chapters.clear();
        notifyDataChanged();
    }

    public void collapseGroup(int i8) {
        collapseGroup(i8, false);
    }

    public void expandGroup(int i8) {
        expandGroup(i8, false);
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public int getChildLayout(int i8) {
        return R.layout.item_duas_section;
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public int getChildrenCount(int i8) {
        ArrayList<DuasSection> duas;
        if (isExpand(i8) && (duas = this.chapters.get(i8).getDuas()) != null) {
            return duas.size();
        }
        return 0;
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public int getFooterLayout(int i8) {
        return -1;
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public int getGroupCount() {
        ArrayList<DuasChapter> arrayList = this.chapters;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public int getHeaderLayout(int i8) {
        return R.layout.item_duas_chapter;
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public boolean hasFooter(int i8) {
        return false;
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public boolean hasHeader(int i8) {
        return true;
    }

    public boolean isExpand(int i8) {
        return this.chapters.get(i8).isExpand();
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public void onBindChildViewHolder(BaseViewHolder baseViewHolder, int i8, int i9) {
        baseViewHolder.setText(R.id.tv_section_title, String.valueOf(this.chapters.get(i8).getDuas().get(i9).getTitle()));
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public void onBindFooterViewHolder(BaseViewHolder baseViewHolder, int i8) {
    }

    @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter
    public void onBindHeaderViewHolder(BaseViewHolder baseViewHolder, int i8) {
        DuasChapter duasChapter = this.chapters.get(i8);
        baseViewHolder.setText(R.id.tv_chapter_name, duasChapter.getName());
        baseViewHolder.setText(R.id.iv_duas, duasChapter.getIcon());
    }

    public void setGroups(ArrayList<DuasChapter> arrayList) {
        this.chapters = arrayList;
        notifyDataChanged();
    }

    public DuasDirectoryAdapter(Context context) {
        super(context);
    }

    public void collapseGroup(int i8, boolean z7) {
        this.chapters.get(i8).setExpand(false);
        if (z7) {
            notifyChildrenRemoved(i8);
        } else {
            notifyDataChanged();
        }
    }

    public void expandGroup(int i8, boolean z7) {
        this.chapters.get(i8).setExpand(true);
        if (z7) {
            notifyChildrenInserted(i8);
        } else {
            notifyDataChanged();
        }
    }
}
