package j;

import android.content.Context;
import android.view.View;
import com.neptunesoft.languesbacdz.R;
import i.AbstractC0213k;
import i.C0215m;
import i.MenuC0211i;
import i.SubMenuC0221s;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230f extends C0215m {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2934l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0233i f2935m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230f(C0233i c0233i, Context context, MenuC0211i menuC0211i, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0211i, true);
        this.f2935m = c0233i;
        this.f2462f = 8388613;
        B.m mVar = c0233i.f2985z;
        this.f2464h = mVar;
        AbstractC0213k abstractC0213k = this.f2465i;
        if (abstractC0213k != null) {
            abstractC0213k.f(mVar);
        }
    }

    @Override // i.C0215m
    public final void c() {
        switch (this.f2934l) {
            case 0:
                C0233i c0233i = this.f2935m;
                c0233i.f2982w = null;
                c0233i.getClass();
                super.c();
                break;
            default:
                C0233i c0233i2 = this.f2935m;
                MenuC0211i menuC0211i = c0233i2.f2967g;
                if (menuC0211i != null) {
                    menuC0211i.c(true);
                }
                c0233i2.v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230f(C0233i c0233i, Context context, SubMenuC0221s subMenuC0221s, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0221s, false);
        this.f2935m = c0233i;
        if (!subMenuC0221s.f2486w.d()) {
            View view2 = c0233i.f2972l;
            this.f2461e = view2 == null ? c0233i.f2971k : view2;
        }
        B.m mVar = c0233i.f2985z;
        this.f2464h = mVar;
        AbstractC0213k abstractC0213k = this.f2465i;
        if (abstractC0213k != null) {
            abstractC0213k.f(mVar);
        }
    }
}
