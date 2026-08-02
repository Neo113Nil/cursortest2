package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    FORBIDDEN_BY_CLIENT_CONFIG("FORBIDDEN_BY_CLIENT_CONFIG"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");

    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f9656a;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final IdentifierStatus from(String str) {
            IdentifierStatus identifierStatus;
            IdentifierStatus[] values = IdentifierStatus.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    identifierStatus = null;
                    break;
                }
                identifierStatus = values[i4];
                if (i.a(identifierStatus.getValue(), str)) {
                    break;
                }
                i4++;
            }
            return identifierStatus == null ? IdentifierStatus.UNKNOWN : identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(String str) {
        this.f9656a = str;
    }

    public static final IdentifierStatus from(String str) {
        return Companion.from(str);
    }

    public final String getValue() {
        return this.f9656a;
    }
}
