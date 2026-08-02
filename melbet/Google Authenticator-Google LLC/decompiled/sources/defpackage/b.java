package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class b implements PrivilegedAction {
    final /* synthetic */ String a = "android.icumessageformat.text.MessagePattern.ApostropheMode";

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return System.getProperty(this.a);
    }
}
