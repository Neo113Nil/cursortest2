package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.dialog.internal.TargetListAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public class TargetListWithSearchView extends ConstraintLayout {
    private AppCompatTextView emptyView;
    private TargetListAdapter.OnSelectedChangeListener listener;
    private int noMembersResId;
    private RecyclerView recyclerView;
    private SearchView searchView;

    public TargetListWithSearchView(Context context, int i4, TargetListAdapter.OnSelectedChangeListener onSelectedChangeListener) {
        super(context);
        this.noMembersResId = i4;
        this.listener = onSelectedChangeListener;
        init();
    }

    private void init() {
        View inflate = View.inflate(getContext(), R.layout.layout_select_target, this);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerView);
        this.searchView = (SearchView) inflate.findViewById(R.id.searchView);
        this.emptyView = (AppCompatTextView) inflate.findViewById(R.id.emptyView);
        this.searchView.setOnQueryTextListener(new SearchView.m() { // from class: com.linecorp.linesdk.dialog.internal.TargetListWithSearchView.1
            private void searchText(String str) {
                TargetListAdapter targetListAdapter = (TargetListAdapter) TargetListWithSearchView.this.recyclerView.getAdapter();
                if (targetListAdapter != null) {
                    if (targetListAdapter.filter(str) != 0) {
                        TargetListWithSearchView.this.emptyView.setVisibility(4);
                        return;
                    }
                    TargetListWithSearchView.this.emptyView.setVisibility(0);
                    if (str.isEmpty()) {
                        TargetListWithSearchView.this.emptyView.setText(TargetListWithSearchView.this.noMembersResId);
                    } else {
                        TargetListWithSearchView.this.emptyView.setText(R.string.search_no_results);
                    }
                }
            }

            @Override // androidx.appcompat.widget.SearchView.m
            public boolean onQueryTextChange(String str) {
                searchText(str);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.m
            public boolean onQueryTextSubmit(String str) {
                searchText(str);
                TargetListWithSearchView.this.searchView.clearFocus();
                return true;
            }
        });
    }

    public void addTargetUsers(List<TargetUser> list) {
        TargetListAdapter targetListAdapter = (TargetListAdapter) this.recyclerView.getAdapter();
        if (targetListAdapter == null) {
            this.recyclerView.setAdapter(new TargetListAdapter(list, this.listener));
        } else {
            targetListAdapter.addAll(list);
        }
        if (this.recyclerView.getAdapter().getItemCount() == 0) {
            this.emptyView.setText(this.noMembersResId);
            this.emptyView.setVisibility(0);
        }
    }

    public void unSelect(TargetUser targetUser) {
        TargetListAdapter targetListAdapter = (TargetListAdapter) this.recyclerView.getAdapter();
        if (targetListAdapter == null) {
            return;
        }
        targetListAdapter.unSelect(targetUser);
    }

    public TargetListWithSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TargetListWithSearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
