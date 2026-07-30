package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ViewGroupKt {
    public static final boolean contains(ViewGroup viewGroup, View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, f6.l lVar) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            lVar.invoke(viewGroup.getChildAt(i8));
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, f6.p pVar) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            pVar.invoke(Integer.valueOf(i8), viewGroup.getChildAt(i8));
        }
    }

    public static final View get(ViewGroup viewGroup, int i8) {
        View childAt = viewGroup.getChildAt(i8);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Size: " + viewGroup.getChildCount());
    }

    public static final kotlin.sequences.m getChildren(final ViewGroup viewGroup) {
        return new kotlin.sequences.m() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // kotlin.sequences.m
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final kotlin.sequences.m getDescendants(final ViewGroup viewGroup) {
        return new kotlin.sequences.m() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // kotlin.sequences.m
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), new f6.l() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                    @Override // f6.l
                    public final Iterator<View> invoke(View view) {
                        kotlin.sequences.m children;
                        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup2 == null || (children = ViewGroupKt.getChildren(viewGroup2)) == null) {
                            return null;
                        }
                        return children.iterator();
                    }
                });
            }
        };
    }

    public static final j6.m getIndices(ViewGroup viewGroup) {
        j6.m until;
        until = j6.v.until(0, viewGroup.getChildCount());
        return until;
    }

    public static final int getSize(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i8) {
        marginLayoutParams.setMargins(i8, i8, i8, i8);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i8, @Px int i9, @Px int i10, @Px int i11) {
        marginLayoutParams.setMargins(i8, i9, i10, i11);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = marginLayoutParams.leftMargin;
        }
        if ((i12 & 2) != 0) {
            i9 = marginLayoutParams.topMargin;
        }
        if ((i12 & 4) != 0) {
            i10 = marginLayoutParams.rightMargin;
        }
        if ((i12 & 8) != 0) {
            i11 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i8, i9, i10, i11);
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i8, @Px int i9, @Px int i10, @Px int i11) {
        marginLayoutParams.setMarginStart(i8);
        marginLayoutParams.topMargin = i9;
        marginLayoutParams.setMarginEnd(i10);
        marginLayoutParams.bottomMargin = i11;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = marginLayoutParams.getMarginStart();
        }
        if ((i12 & 2) != 0) {
            i9 = marginLayoutParams.topMargin;
        }
        if ((i12 & 4) != 0) {
            i10 = marginLayoutParams.getMarginEnd();
        }
        if ((i12 & 8) != 0) {
            i11 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i8);
        marginLayoutParams.topMargin = i9;
        marginLayoutParams.setMarginEnd(i10);
        marginLayoutParams.bottomMargin = i11;
    }
}
