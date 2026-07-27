package com.onesignal.user.internal;

import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.properties.PropertiesModel;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class LoginHelper$switchUser$1$1 extends j implements InterfaceC1445p {
    final /* synthetic */ String $externalId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginHelper$switchUser$1$1(String str) {
        super(2);
        this.$externalId = str;
    }

    @Override // t4.InterfaceC1445p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((IdentityModel) obj, (PropertiesModel) obj2);
        return v.f5689a;
    }

    public final void invoke(IdentityModel identityModel, PropertiesModel propertiesModel) {
        i.e(identityModel, "identityModel");
        i.e(propertiesModel, "<anonymous parameter 1>");
        identityModel.setExternalId(this.$externalId);
    }
}
