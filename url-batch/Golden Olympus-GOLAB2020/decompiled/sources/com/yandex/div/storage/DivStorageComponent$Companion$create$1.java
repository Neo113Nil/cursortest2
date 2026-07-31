package com.yandex.div.storage;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes2.dex */
public final class DivStorageComponent$Companion$create$1 extends s implements Function0<DivParsingHistogramReporter> {
    public static final DivStorageComponent$Companion$create$1 INSTANCE = new DivStorageComponent$Companion$create$1();

    DivStorageComponent$Companion$create$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DivParsingHistogramReporter invoke() {
        return DivParsingHistogramReporter.Companion.getDEFAULT();
    }
}
