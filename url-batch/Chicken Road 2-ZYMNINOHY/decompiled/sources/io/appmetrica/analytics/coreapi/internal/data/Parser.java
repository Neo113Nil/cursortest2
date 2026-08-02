package io.appmetrica.analytics.coreapi.internal.data;

import O3.l;
import c3.C0293e;

/* loaded from: classes.dex */
public interface Parser<IN, OUT> {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <IN, OUT> OUT parseOrNull(Parser<? super IN, ? extends OUT> parser, IN in) {
            OUT out;
            try {
                out = parser.parse(in);
            } catch (Throwable th) {
                out = (OUT) l.h(th);
            }
            if (out instanceof C0293e) {
                return null;
            }
            return out;
        }
    }

    OUT parse(IN in);

    OUT parseOrNull(IN in);
}
