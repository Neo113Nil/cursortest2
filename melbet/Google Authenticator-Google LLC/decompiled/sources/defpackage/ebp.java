package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebp {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final ebn g;
    public final gzp h;
    public final gzp i;

    public ebp(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, ebn ebnVar, gzp gzpVar, gzp gzpVar2) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = ebnVar;
        this.h = gzpVar;
        this.i = gzpVar2;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebp) {
            ebp ebpVar = (ebp) obj;
            if (this.a == ebpVar.a && ((drawable = this.b) != null ? drawable.equals(ebpVar.b) : ebpVar.b == null) && this.c == ebpVar.c && this.d.equals(ebpVar.d) && this.e == ebpVar.e && this.f.equals(ebpVar.f) && this.g.equals(ebpVar.g) && this.h.equals(ebpVar.h) && this.i.equals(ebpVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.b;
        return ((((this.g.hashCode() ^ (((((((((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ 1237) * 1000003) ^ this.f.hashCode()) * 1525764945) ^ 1237) * 1000003)) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        gzp gzpVar = this.i;
        gzp gzpVar2 = this.h;
        ebn ebnVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "ActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", newHighlight=false, onClickListener=" + String.valueOf(onClickListener) + ", visibilityHandler=null, trailingTextContentLiveData=null, highlightTextRetriever=null, visibleOnIncognito=false, actionType=" + String.valueOf(ebnVar) + ", availabilityChecker=" + String.valueOf(gzpVar2) + ", customLabelContentDescription=" + String.valueOf(gzpVar) + "}";
    }

    public ebp() {
        throw null;
    }
}
