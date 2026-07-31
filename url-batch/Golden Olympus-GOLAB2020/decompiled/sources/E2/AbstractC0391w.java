package E2;

import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0391w {
    public static final C0383n a(Q sb, AbstractC0348a json) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        return json.d().i() ? new C0390v(sb, json) : new C0383n(sb);
    }
}
