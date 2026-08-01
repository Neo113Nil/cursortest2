package a8;

import android.text.TextUtils;
import c4.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements c4.q, j5.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f342d;

    /* renamed from: e, reason: collision with root package name */
    public final String f343e;

    public /* synthetic */ f(String str, int i3) {
        this.f342d = i3;
        this.f343e = str;
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f343e);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // c4.q
    public boolean c(CharSequence charSequence, int i3, int i10, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i3, i10), this.f343e)) {
            return true;
        }
        xVar.f1797c = (xVar.f1797c & 3) | 4;
        return false;
    }

    @Override // j5.f
    public String h() {
        return this.f343e;
    }

    public String toString() {
        switch (this.f342d) {
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return n0.l.h(new StringBuilder("<"), this.f343e, '>');
            default:
                return super.toString();
        }
    }

    @Override // c4.q
    public Object getResult() {
        return this;
    }

    @Override // j5.f
    public void i(j5.e eVar) {
    }
}
