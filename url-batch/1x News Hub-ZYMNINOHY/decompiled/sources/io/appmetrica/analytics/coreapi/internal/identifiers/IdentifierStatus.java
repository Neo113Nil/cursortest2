package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FORBIDDEN_BY_CLIENT_CONFIG("FORBIDDEN_BY_CLIENT_CONFIG"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");

    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f5403a;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final IdentifierStatus from(String str) {
            IdentifierStatus identifierStatus;
            IdentifierStatus[] values = IdentifierStatus.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    identifierStatus = null;
                    break;
                }
                identifierStatus = values[i3];
                if (j.a(identifierStatus.getValue(), str)) {
                    break;
                }
                i3++;
            }
            return identifierStatus == null ? IdentifierStatus.UNKNOWN : identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(String str) {
        this.f5403a = str;
    }

    public static final IdentifierStatus from(String str) {
        return Companion.from(str);
    }

    public final String getValue() {
        return this.f5403a;
    }
}
