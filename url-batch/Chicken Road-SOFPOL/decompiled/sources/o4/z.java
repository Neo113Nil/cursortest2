package o4;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f5705b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5706a = new LinkedHashMap();

    public final void a(y yVar) {
        q6.i.e(yVar, "navigator");
        String C = m.a.C(yVar.getClass());
        if (C.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f5706a;
        y yVar2 = (y) linkedHashMap.get(C);
        if (q6.i.a(yVar2, yVar)) {
            return;
        }
        if (yVar2 != null && yVar2.f5704b) {
            throw new IllegalStateException(("Navigator " + yVar + " is replacing an already attached " + yVar2).toString());
        }
        if (!yVar.f5704b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + yVar + " is already attached to another NavController").toString());
    }

    public final y b(String str) {
        q6.i.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        y yVar = (y) this.f5706a.get(str);
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }
}
