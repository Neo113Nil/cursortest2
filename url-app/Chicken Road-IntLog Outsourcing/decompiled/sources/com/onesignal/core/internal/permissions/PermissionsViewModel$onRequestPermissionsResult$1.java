package com.onesignal.core.internal.permissions;

import B0.o;
import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import G4.s;
import G4.w;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.internal.permissions.PermissionsViewModel$onRequestPermissionsResult$1", f = "PermissionsViewModel.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PermissionsViewModel$onRequestPermissionsResult$1 extends h implements InterfaceC1445p {
    final /* synthetic */ int[] $grantResults;
    final /* synthetic */ String[] $permissions;
    final /* synthetic */ boolean $shouldShowRationaleAfter;
    int label;
    final /* synthetic */ PermissionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsViewModel$onRequestPermissionsResult$1(String[] strArr, int[] iArr, PermissionsViewModel permissionsViewModel, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$permissions = strArr;
        this.$grantResults = iArr;
        this.this$0 = permissionsViewModel;
        this.$shouldShowRationaleAfter = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new PermissionsViewModel$onRequestPermissionsResult$1(this.$permissions, this.$grantResults, this.this$0, this.$shouldShowRationaleAfter, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((PermissionsViewModel$onRequestPermissionsResult$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        IPreferencesService preferenceService;
        s sVar;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            this.label = 1;
            if (AbstractC0024y.d(500L, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        String[] strArr = this.$permissions;
        boolean z5 = false;
        if (strArr.length == 0) {
            z = false;
        } else {
            String str = strArr[0];
            int[] iArr = this.$grantResults;
            boolean z6 = !(iArr.length == 0) && iArr[0] == 0;
            if (z6) {
                preferenceService = this.this$0.getPreferenceService();
                preferenceService.saveBool("OneSignal", o.i(PreferenceOneSignalKeys.PREFS_OS_USER_RESOLVED_PERMISSION_PREFIX, str), Boolean.TRUE);
            } else {
                z5 = this.this$0.shouldShowSettings(str, this.$shouldShowRationaleAfter);
            }
            z = z5;
            z5 = z6;
        }
        this.this$0.executeCallback(z5, z);
        sVar = this.this$0._shouldFinish;
        Boolean bool = Boolean.TRUE;
        w wVar = (w) sVar;
        wVar.getClass();
        wVar.c(null, bool);
        return v.f5689a;
    }
}
