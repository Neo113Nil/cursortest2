package com.squareup.protos.wire.roster.mds;

import com.squareup.protos.wire.roster.mds.ContactMethod;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes9.dex */
public final class ContactMethod$ContactType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ContactMethod.ContactType.Companion.getClass();
        return Plane.m4215fromValue(i);
    }
}
