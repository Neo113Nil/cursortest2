package com.ironsource;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public enum jg {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f16844b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f16849a;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final jg a(@Nullable Integer num) {
            jg jgVar;
            jg[] values = jg.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    jgVar = null;
                    break;
                }
                jgVar = values[i4];
                int b4 = jgVar.b();
                if (num != null && b4 == num.intValue()) {
                    break;
                }
                i4++;
            }
            return jgVar == null ? jg.UnknownProvider : jgVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final jg a(@NotNull String dynamicDemandSourceId) {
            Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            List split$default = StringsKt.split$default(dynamicDemandSourceId, new String[]{BundleUtil.UNDERLINE_TAG}, false, 0, 6, null);
            return split$default.size() < 2 ? jg.UnknownProvider : a(StringsKt.toIntOrNull((String) split$default.get(1)));
        }
    }

    jg(int i4) {
        this.f16849a = i4;
    }

    public final int b() {
        return this.f16849a;
    }
}
