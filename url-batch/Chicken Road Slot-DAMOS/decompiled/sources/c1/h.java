package c1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t0;
import kotlin.collections.w;
import kotlin.collections.x;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final a f1484d;

    public h(a aVar) {
        this.f1484d = aVar;
        if (aVar.f1477b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = aVar.f1476a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            c cVar = (c) list.get(i3);
            if (!w.k(iArr, cVar.f1479a)) {
                if (cVar.f1479a == 100) {
                    int i11 = i3 + 2;
                    if (i11 < size && ((c) list.get(i11)).f1479a == 1000) {
                        break;
                    } else if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
            i3 = i10;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            stackTraceElementArr[i12] = new StackTraceElement("$$compose", "m$" + ((c) arrayList.get(i12)).f1479a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.f1484d;
        if (!aVar.f1477b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        id.d b10 = x.b();
        List list = aVar.f1476a;
        list.getClass();
        t0 t0Var = new t0(list);
        int b11 = t0Var.b();
        for (int i3 = 0; i3 < b11; i3++) {
            ((c) t0Var.get(i3)).getClass();
        }
        id.d a9 = x.a(b10);
        a9.getClass();
        t0 t0Var2 = new t0(a9);
        int b12 = t0Var2.b();
        for (int i10 = 0; i10 < b12; i10++) {
            String str = (String) t0Var2.get(i10);
            sb2.append("\tat ");
            sb2.append(str);
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
