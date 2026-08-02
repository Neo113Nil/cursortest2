package com.squareup.protos.franklin.app;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum GetUnredactedIssuedCardResponse$Status implements WireEnum {
    INVALID(0),
    SUCCESS(1),
    INVALID_PASSCODE(2),
    TOO_MANY_ATTEMPTS(3),
    CONCURRENT_MODIFICATION(4),
    FAILURE(5);

    public static final ResourceFileSystem.Companion Companion;
    public final int value;

    static {
        GetUnredactedIssuedCardResponse$Status getUnredactedIssuedCardResponse$Status = INVALID;
        Companion = new ResourceFileSystem.Companion();
        new GetUnredactedIssuedCardResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GetUnredactedIssuedCardResponse$Status.class), Syntax.PROTO_2, getUnredactedIssuedCardResponse$Status);
    }

    GetUnredactedIssuedCardResponse$Status(int i) {
        this.value = i;
    }

    public static final GetUnredactedIssuedCardResponse$Status fromValue(int i) {
        Companion.getClass();
        return ResourceFileSystem.Companion.m4354fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
