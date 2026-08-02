package l1;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: l1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1266m extends E0.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1266m(t tVar, int i4) {
        super(tVar);
        this.f14248c = i4;
    }

    @Override // E0.e
    public final int b(View view) {
        int right;
        int i4;
        switch (this.f14248c) {
            case 0:
                u uVar = (u) view.getLayoutParams();
                ((t) this.f471b).getClass();
                right = view.getRight() + ((u) view.getLayoutParams()).f14262a.right;
                i4 = ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
                break;
            default:
                u uVar2 = (u) view.getLayoutParams();
                ((t) this.f471b).getClass();
                right = view.getBottom() + ((u) view.getLayoutParams()).f14262a.bottom;
                i4 = ((ViewGroup.MarginLayoutParams) uVar2).bottomMargin;
                break;
        }
        return right + i4;
    }

    @Override // E0.e
    public final int c(View view) {
        int left;
        int i4;
        switch (this.f14248c) {
            case 0:
                u uVar = (u) view.getLayoutParams();
                ((t) this.f471b).getClass();
                left = view.getLeft() - ((u) view.getLayoutParams()).f14262a.left;
                i4 = ((ViewGroup.MarginLayoutParams) uVar).leftMargin;
                break;
            default:
                u uVar2 = (u) view.getLayoutParams();
                ((t) this.f471b).getClass();
                left = view.getTop() - ((u) view.getLayoutParams()).f14262a.top;
                i4 = ((ViewGroup.MarginLayoutParams) uVar2).topMargin;
                break;
        }
        return left - i4;
    }

    @Override // E0.e
    public final int d() {
        int i4;
        int t4;
        switch (this.f14248c) {
            case 0:
                t tVar = (t) this.f471b;
                i4 = tVar.f14260f;
                t4 = tVar.t();
                break;
            default:
                t tVar2 = (t) this.f471b;
                i4 = tVar2.f14261g;
                t4 = tVar2.r();
                break;
        }
        return i4 - t4;
    }

    @Override // E0.e
    public final int e() {
        switch (this.f14248c) {
            case 0:
                return ((t) this.f471b).s();
            default:
                return ((t) this.f471b).u();
        }
    }

    @Override // E0.e
    public final int f() {
        int s4;
        int t4;
        switch (this.f14248c) {
            case 0:
                t tVar = (t) this.f471b;
                s4 = tVar.f14260f - tVar.s();
                t4 = tVar.t();
                break;
            default:
                t tVar2 = (t) this.f471b;
                s4 = tVar2.f14261g - tVar2.u();
                t4 = tVar2.r();
                break;
        }
        return s4 - t4;
    }
}
