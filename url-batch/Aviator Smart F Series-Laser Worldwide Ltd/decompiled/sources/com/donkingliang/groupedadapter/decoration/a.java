package com.donkingliang.groupedadapter.decoration;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public interface a {
    boolean checkLayoutManager(RecyclerView recyclerView);

    Drawable getChildColumnDivider(int i8, int i9);

    int getChildColumnDividerSize(int i8, int i9);

    Drawable getChildRowDivider(int i8, int i9);

    int getChildRowDividerSize(int i8, int i9);

    Drawable getFooterDivider(int i8);

    int getFooterDividerSize(int i8);

    Drawable getHeaderDivider(int i8);

    int getHeaderDividerSize(int i8);
}
