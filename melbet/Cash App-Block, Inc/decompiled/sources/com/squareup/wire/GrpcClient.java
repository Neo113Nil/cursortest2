package com.squareup.wire;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public abstract class GrpcClient {
    public static String serializeTimeout(long j) {
        if (j < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Timeout too small");
            return null;
        }
        if (j >= 100000000) {
            return j < 100000000000L ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), j / 1000, 'u') : j < 100000000000000L ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), j / 1000000, 'm') : j < 100000000000000000L ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), j / 1000000000, 'S') : j < 6000000000000000000L ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), j / 60000000000L, 'M') : JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), j / 3600000000000L, 'H');
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('n');
        return sb.toString();
    }
}
