package com.onesignal.core.internal.preferences.impl;

import f4.v;
import k4.InterfaceC1218d;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.core.internal.preferences.impl.PreferencesService$doWorkAsync$1", f = "PreferencesService.kt", l = {232, 236}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PreferencesService$doWorkAsync$1 extends h implements InterfaceC1441l {
    long J$0;
    int label;
    final /* synthetic */ PreferencesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesService$doWorkAsync$1(PreferencesService preferencesService, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = preferencesService;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new PreferencesService$doWorkAsync$1(this.this$0, interfaceC1218d);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:7:0x000f, B:9:0x0037, B:10:0x0045, B:12:0x004b, B:74:0x0068, B:76:0x0070, B:77:0x007a, B:15:0x0084, B:17:0x008c, B:18:0x0097, B:19:0x009b, B:62:0x00fd, B:63:0x00fe, B:69:0x0103, B:70:0x0104, B:80:0x0105, B:90:0x0129, B:100:0x0020, B:21:0x009c, B:22:0x00a4, B:24:0x00aa, B:58:0x00b8, B:27:0x00c0, B:55:0x00c4, B:30:0x00ce, B:52:0x00d2, B:33:0x00dc, B:49:0x00e0, B:36:0x00ea, B:46:0x00ee, B:41:0x00f6, B:61:0x00fa), top: B:2:0x0007, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128 A[EDGE_INSN: B:96:0x0128->B:89:0x0128 BREAK  A[LOOP:0: B:9:0x0037->B:95:0x0037], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0137 -> B:8:0x0037). Please report as a decompilation issue!!! */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.preferences.impl.PreferencesService$doWorkAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((PreferencesService$doWorkAsync$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
