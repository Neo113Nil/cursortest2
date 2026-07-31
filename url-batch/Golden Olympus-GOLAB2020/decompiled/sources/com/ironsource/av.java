package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class av extends AbstractC1458f<a> {

    @Metadata
    public interface a {
        void a();
    }

    public av(long j4) {
        super(j4);
    }

    public final void a(@Nullable a aVar) {
        a((av) aVar);
    }

    @Override // com.ironsource.AbstractC1458f
    protected void b() {
        a aVar = (a) this.f16189d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e() {
        c();
    }
}
