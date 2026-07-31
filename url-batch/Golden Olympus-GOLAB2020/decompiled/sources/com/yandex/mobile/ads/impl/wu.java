package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class wu implements InterfaceC2259tl {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34183b = 0;

    static {
        new wu(sj0.h());
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Mk
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                wu a4;
                a4 = wu.a(bundle);
                return a4;
            }
        };
    }

    public wu(List<uu> list) {
        sj0.a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wu a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new wu(parcelableArrayList == null ? sj0.h() : C2282ul.a(uu.f33247t, parcelableArrayList));
    }
}
