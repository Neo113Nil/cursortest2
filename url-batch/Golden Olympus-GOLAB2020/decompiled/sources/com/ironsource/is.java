package com.ironsource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class is {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f16763a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<String> f16764b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16765c;

    public is(@Nullable String str, @Nullable List<String> list, boolean z4) {
        this.f16763a = str;
        this.f16764b = list;
        this.f16765c = z4;
    }

    public final boolean a() {
        if (this.f16765c) {
            List<String> list = this.f16764b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f16763a;
                    if (str2 != null && StringsKt.K(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<String> list2 = this.f16764b;
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                String str4 = this.f16763a;
                if (str4 != null && StringsKt.P(str4, str3, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final String b() {
        return this.f16763a;
    }

    public /* synthetic */ is(String str, List list, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i4 & 4) != 0 ? false : z4);
    }
}
