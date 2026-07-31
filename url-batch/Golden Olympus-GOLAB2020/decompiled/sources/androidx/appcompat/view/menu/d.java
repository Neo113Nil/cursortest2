package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f10386a;

    /* renamed from: b, reason: collision with root package name */
    private int f10387b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10388c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10389d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f10390e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10391f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f10389d = z4;
        this.f10390e = layoutInflater;
        this.f10386a = eVar;
        this.f10391f = i4;
        a();
    }

    void a() {
        g expandedItem = this.f10386a.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<g> nonActionItems = this.f10386a.getNonActionItems();
            int size = nonActionItems.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (nonActionItems.get(i4) == expandedItem) {
                    this.f10387b = i4;
                    return;
                }
            }
        }
        this.f10387b = -1;
    }

    public e b() {
        return this.f10386a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i4) {
        ArrayList<g> nonActionItems = this.f10389d ? this.f10386a.getNonActionItems() : this.f10386a.getVisibleItems();
        int i5 = this.f10387b;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return nonActionItems.get(i4);
    }

    public void d(boolean z4) {
        this.f10388c = z4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10387b < 0 ? (this.f10389d ? this.f10386a.getNonActionItems() : this.f10386a.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f10390e.inflate(this.f10391f, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i5 = i4 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f10386a.isGroupDividerEnabled() && groupId != (i5 >= 0 ? getItem(i5).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f10388c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i4), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
