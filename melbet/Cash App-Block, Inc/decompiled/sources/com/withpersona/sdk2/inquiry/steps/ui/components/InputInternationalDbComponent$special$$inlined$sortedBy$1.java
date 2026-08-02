package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes9.dex */
public final class InputInternationalDbComponent$special$$inlined$sortedBy$1 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ComparisonsKt__ComparisonsKt.compareValues(((InputInternationalDbComponent.IdOption) obj).name, ((InputInternationalDbComponent.IdOption) obj2).name);
    }
}
