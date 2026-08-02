package com.squareup.protos.franklin.privacy;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum IncomingRequestPolicy implements WireEnum {
    ALLOW_ALL(1),
    ALLOW_CONTACTS(2),
    DENY_ALL(3);

    public final int value;
    public static final ResourceFileSystem.Companion Companion = new ResourceFileSystem.Companion();
    public static final IncomingRequestPolicy$Companion$ADAPTER$1 ADAPTER = new IncomingRequestPolicy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IncomingRequestPolicy.class), Syntax.PROTO_2, null);

    IncomingRequestPolicy(int i) {
        this.value = i;
    }

    public static final IncomingRequestPolicy fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ALLOW_ALL;
        }
        if (i == 2) {
            return ALLOW_CONTACTS;
        }
        if (i != 3) {
            return null;
        }
        return DENY_ALL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
