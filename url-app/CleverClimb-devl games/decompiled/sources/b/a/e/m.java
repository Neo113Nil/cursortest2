package b.a.e;

import java.io.IOException;
import java.util.List;

/* compiled from: PushObserver.java */
/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1993a = new m() { // from class: b.a.e.m.1
        @Override // b.a.e.m
        public void a(int i, b bVar) {
        }

        @Override // b.a.e.m
        public boolean a(int i, List<c> list) {
            return true;
        }

        @Override // b.a.e.m
        public boolean a(int i, List<c> list, boolean z) {
            return true;
        }

        @Override // b.a.e.m
        public boolean a(int i, c.e eVar, int i2, boolean z) throws IOException {
            eVar.h(i2);
            return true;
        }
    };

    void a(int i, b bVar);

    boolean a(int i, c.e eVar, int i2, boolean z) throws IOException;

    boolean a(int i, List<c> list);

    boolean a(int i, List<c> list, boolean z);
}
