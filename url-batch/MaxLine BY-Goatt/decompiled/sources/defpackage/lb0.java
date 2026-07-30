package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lb0 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public w50 g;
    public int h;
    public final /* synthetic */ ob0 i;

    public lb0(ob0 ob0Var, String str) {
        this.i = ob0Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.m.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.m.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final mb0 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ob0 ob0Var = this.i;
            if (i >= size) {
                this.h++;
                return new mb0(ob0Var, this);
            }
            if (!ob0Var.B.f((qz1) arrayList.get(i))) {
                try {
                    ob0Var.y(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
