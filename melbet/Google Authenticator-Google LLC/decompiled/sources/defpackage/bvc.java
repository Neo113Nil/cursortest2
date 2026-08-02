package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvc extends ms {
    public hvi a;
    public final /* synthetic */ bvm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvc(bvm bvmVar) {
        super(null);
        this.b = bvmVar;
        this.a = hve.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0039  */
    @Override // defpackage.ms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RecyclerView recyclerView, lp lpVar, float f, float f2, int i, boolean z) {
        boolean z2;
        int right;
        boolean z3;
        int right2;
        boolean z4 = true;
        if (i == 1) {
            View view = lpVar.a;
            boolean z5 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            boolean z6 = f > 0.0f;
            if (f > 0.0f) {
                if (z5) {
                    z5 = true;
                }
                z2 = true;
                int i2 = z2 ? R.drawable.gs_edit_vd_theme_24 : R.drawable.gs_delete_vd_theme_24;
                int i3 = true != z2 ? R.attr.colorError : R.attr.colorSecondary;
                int i4 = true != z2 ? -65536 : -16776961;
                int i5 = true != z2 ? R.attr.colorOnError : R.attr.colorOnSecondary;
                int i6 = (int) f;
                ColorDrawable colorDrawable = new ColorDrawable();
                Context context = this.b.e;
                colorDrawable.setColor(fhq.d(context, i3, i4));
                if (z6) {
                    right = view.getLeft();
                    z3 = true;
                } else {
                    right = view.getRight() + i6;
                    z3 = false;
                }
                colorDrawable.setBounds(right, view.getTop(), z3 ? view.getLeft() + i6 : view.getRight(), view.getBottom());
                colorDrawable.draw(canvas);
                Drawable drawable = context.getDrawable(i2);
                drawable.setTint(fhq.d(context, i5, -1));
                int bottom = view.getBottom() - view.getTop();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int i7 = bottom - intrinsicHeight;
                int top = view.getTop() + (i7 / 2);
                int i8 = intrinsicHeight + top;
                int i9 = i7 / 4;
                if (z6) {
                    right2 = view.getLeft() + i9;
                } else {
                    right2 = (view.getRight() - i9) - intrinsicWidth;
                    z4 = false;
                }
                int left = z4 ? view.getLeft() + i9 + intrinsicWidth : view.getRight() - i9;
                drawable.setBounds(right2, top, left, i8);
                if ((z4 && i6 > (left - right2) + intrinsicWidth) || (!z4 && (-i6) > (left - right2) + intrinsicWidth)) {
                    drawable.draw(canvas);
                }
            }
            if (f >= 0.0f || !z5) {
                z2 = false;
                if (z2) {
                }
                if (true != z2) {
                }
                if (true != z2) {
                }
                if (true != z2) {
                }
                int i62 = (int) f;
                ColorDrawable colorDrawable2 = new ColorDrawable();
                Context context2 = this.b.e;
                colorDrawable2.setColor(fhq.d(context2, i3, i4));
                if (z6) {
                }
                colorDrawable2.setBounds(right, view.getTop(), z3 ? view.getLeft() + i62 : view.getRight(), view.getBottom());
                colorDrawable2.draw(canvas);
                Drawable drawable2 = context2.getDrawable(i2);
                drawable2.setTint(fhq.d(context2, i5, -1));
                int bottom2 = view.getBottom() - view.getTop();
                int intrinsicHeight2 = drawable2.getIntrinsicHeight();
                int intrinsicWidth2 = drawable2.getIntrinsicWidth();
                int i72 = bottom2 - intrinsicHeight2;
                int top2 = view.getTop() + (i72 / 2);
                int i82 = intrinsicHeight2 + top2;
                int i92 = i72 / 4;
                if (z6) {
                }
                if (z4) {
                }
                drawable2.setBounds(right2, top2, left, i82);
                if (z4) {
                    drawable2.draw(canvas);
                }
                drawable2.draw(canvas);
            }
            z2 = true;
            if (z2) {
            }
            if (true != z2) {
            }
            if (true != z2) {
            }
            if (true != z2) {
            }
            int i622 = (int) f;
            ColorDrawable colorDrawable22 = new ColorDrawable();
            Context context22 = this.b.e;
            colorDrawable22.setColor(fhq.d(context22, i3, i4));
            if (z6) {
            }
            colorDrawable22.setBounds(right, view.getTop(), z3 ? view.getLeft() + i622 : view.getRight(), view.getBottom());
            colorDrawable22.draw(canvas);
            Drawable drawable22 = context22.getDrawable(i2);
            drawable22.setTint(fhq.d(context22, i5, -1));
            int bottom22 = view.getBottom() - view.getTop();
            int intrinsicHeight22 = drawable22.getIntrinsicHeight();
            int intrinsicWidth22 = drawable22.getIntrinsicWidth();
            int i722 = bottom22 - intrinsicHeight22;
            int top22 = view.getTop() + (i722 / 2);
            int i822 = intrinsicHeight22 + top22;
            int i922 = i722 / 4;
            if (z6) {
            }
            if (z4) {
            }
            drawable22.setBounds(right2, top22, left, i822);
            if (z4) {
            }
            drawable22.draw(canvas);
        }
        View view2 = lpVar.a;
        if (z && view2.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            int i10 = yq.a;
            Float valueOf = Float.valueOf(view2.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view2) {
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view2.setElevation(f3 + 1.0f);
            view2.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view2.setTranslationX(f);
        view2.setTranslationY(f2);
    }

    @Override // defpackage.ms
    public final int f() {
        return this.b.Q ? 0 : 48;
    }
}
