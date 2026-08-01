package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes.dex */
interface pvs {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<vG> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int icD(int i, int i2, int i3);

    View icD(int i);

    int pvs(int i, int i2, int i3);

    int pvs(View view);

    int pvs(View view, int i, int i2);

    View pvs(int i);

    void pvs(View view, int i, int i2, vG vGVar);

    void pvs(vG vGVar);

    boolean pvs();

    void setFlexLines(List<vG> list);
}
