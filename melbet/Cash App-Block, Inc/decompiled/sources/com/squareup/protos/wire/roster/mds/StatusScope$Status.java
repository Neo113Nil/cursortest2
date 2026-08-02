package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public enum StatusScope$Status implements WireEnum {
    DO_NOT_USE(0),
    ACTIVE(1),
    DELETED(2);

    public static final StatusScope$Status$Companion$ADAPTER$1 ADAPTER;
    public static final POPMatchingFactory Companion;
    public final int value;

    static {
        StatusScope$Status statusScope$Status = DO_NOT_USE;
        Companion = new POPMatchingFactory(8);
        ADAPTER = new StatusScope$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StatusScope$Status.class), Syntax.PROTO_2, statusScope$Status);
    }

    StatusScope$Status(int i) {
        this.value = i;
    }

    public static final StatusScope$Status fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return DO_NOT_USE;
        }
        if (i == 1) {
            return ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return DELETED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
