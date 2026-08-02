package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public enum ImageLayout implements WireEnum {
    VERTICAL_RECTANGLE(0),
    HORIZONTAL_RECTANGLE(1);

    public static final ImageLayout$Companion$ADAPTER$1 ADAPTER;
    public static final AsyncTimeout.Companion Companion;
    public final int value;

    static {
        ImageLayout imageLayout = VERTICAL_RECTANGLE;
        Companion = new AsyncTimeout.Companion();
        ADAPTER = new ImageLayout$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ImageLayout.class), Syntax.PROTO_2, imageLayout);
    }

    ImageLayout(int i) {
        this.value = i;
    }

    public static final ImageLayout fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return VERTICAL_RECTANGLE;
        }
        if (i != 1) {
            return null;
        }
        return HORIZONTAL_RECTANGLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
