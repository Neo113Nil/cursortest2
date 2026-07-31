package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gw;
import com.yandex.mobile.ads.impl.px;
import com.yandex.mobile.ads.impl.wx;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f35799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qy0 f35800b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fz0 f35801c;

    public zw(@NotNull Context context, @NotNull qy0 versionValidator, @NotNull fz0 networkErrorMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(versionValidator, "versionValidator");
        Intrinsics.checkNotNullParameter(networkErrorMapper, "networkErrorMapper");
        this.f35799a = context;
        this.f35800b = versionValidator;
        this.f35801c = networkErrorMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(List<wx> list, gw gwVar) {
        qx qxVar;
        qx qxVar2;
        if (gwVar.a() instanceof gw.a.c) {
            String string = this.f35799a.getString(R.string.not_integrated);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            qxVar2 = new qx(string, 0, null, 0, 14);
        } else {
            String f4 = gwVar.f();
            if (f4 == null || StringsKt.z(f4)) {
                String string2 = this.f35799a.getString(R.string.sdk_undefined);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                qxVar = new qx(string2, 0, null, 0, 14);
                gw.a a4 = gwVar.a();
                gw.a.b bVar = !(a4 instanceof gw.a.b) ? (gw.a.b) a4 : null;
                ez0 a5 = bVar != null ? bVar.a() : null;
                StringBuilder sb = new StringBuilder();
                if (gwVar.b() != null) {
                    sb.append("Adapter " + gwVar.b() + "  ");
                }
                if (gwVar.c() != null) {
                    sb.append("Latest " + gwVar.c());
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                String b4 = gwVar.b();
                list.add(new wx.g(gwVar.e(), gwVar.d(), qxVar, new ow(sb2, (b4 != null || StringsKt.z(b4) || this.f35800b.a(gwVar.b(), gwVar.c())) ? R.attr.debug_panel_label_secondary : R.attr.debug_panel_color_orange), this.f35801c.a(a5), null, null, null, null, null, gwVar.f(), 992));
            }
            String lowerCase = gwVar.f().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            qxVar2 = new qx("SDK " + lowerCase, 0, null, 0, 14);
        }
        qxVar = qxVar2;
        gw.a a42 = gwVar.a();
        if (!(a42 instanceof gw.a.b)) {
        }
        if (bVar != null) {
        }
        StringBuilder sb3 = new StringBuilder();
        if (gwVar.b() != null) {
        }
        if (gwVar.c() != null) {
        }
        String sb22 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
        String b42 = gwVar.b();
        list.add(new wx.g(gwVar.e(), gwVar.d(), qxVar, new ow(sb22, (b42 != null || StringsKt.z(b42) || this.f35800b.a(gwVar.b(), gwVar.c())) ? R.attr.debug_panel_label_secondary : R.attr.debug_panel_color_orange), this.f35801c.a(a5), null, null, null, null, null, gwVar.f(), 992));
    }

    private final qx a(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            String string = this.f35799a.getString(R.string.yes);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new qx(string, 0, null, 0, 14);
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            String string2 = this.f35799a.getString(R.string.no);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new qx(string2, 0, null, 0, 14);
        }
        if (bool == null) {
            String string3 = this.f35799a.getString(R.string.no_value_set);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new qx(string3, 0, null, 0, 14);
        }
        throw new W1.m();
    }

    @NotNull
    public final List<wx> a(@NotNull xw debugPanelData) {
        qx qxVar;
        int a4;
        qx qxVar2;
        Intrinsics.checkNotNullParameter(debugPanelData, "debugPanelData");
        List<wx> createListBuilder = CollectionsKt.createListBuilder();
        mw c4 = debugPanelData.c();
        wx.d dVar = wx.d.f34228a;
        createListBuilder.add(dVar);
        String string = this.f35799a.getString(R.string.application_info);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        createListBuilder.add(new wx.e(string));
        createListBuilder.add(new wx.f("Application ID", c4.b()));
        String string2 = this.f35799a.getString(R.string.app_version);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        createListBuilder.add(new wx.f(string2, c4.c()));
        String string3 = this.f35799a.getString(R.string.system);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        createListBuilder.add(new wx.f(string3, c4.d()));
        String string4 = this.f35799a.getString(R.string.api_level);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        createListBuilder.add(new wx.f(string4, c4.a()));
        ox f4 = debugPanelData.f();
        createListBuilder.add(dVar);
        String string5 = this.f35799a.getString(R.string.sdk_integration);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        createListBuilder.add(new wx.e(string5));
        String string6 = this.f35799a.getString(R.string.ads_sdk_version);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        createListBuilder.add(new wx.f(string6, f4.b()));
        int ordinal = f4.a().b().ordinal();
        if (ordinal == 0) {
            String string7 = this.f35799a.getString(R.string.integrated);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            qxVar = new qx(string7, R.attr.debug_panel_color_green, Integer.valueOf(R.drawable.debug_panel_icon_success), 0, 8);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new W1.m();
            }
            String string8 = this.f35799a.getString(R.string.integration_errors);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            qxVar = new qx(string8, R.attr.debug_panel_color_red, Integer.valueOf(R.drawable.debug_panel_icon_error), 0, 8);
        } else {
            String string9 = this.f35799a.getString(R.string.integrated);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            qxVar = new qx(string9, R.attr.debug_panel_color_red, Integer.valueOf(R.drawable.debug_panel_icon_error), 0, 8);
        }
        if (f4.a().b() == px.a.f30607b) {
            a4 = R.attr.debug_panel_label_primary;
        } else {
            a4 = qxVar.a();
        }
        List<String> a5 = f4.a().a();
        createListBuilder.add(new wx.f(this.f35799a.getString(R.string.sdk_integration_status), qxVar, a5 != null ? new ow(a4, R.style.DebugPanelText_Body2, CollectionsKt.joinToString$default(a5, "\n", null, null, 0, null, null, 62, null)) : null));
        vv a6 = debugPanelData.a();
        if (a6.c() != null || a6.a() != null || a6.b() != null) {
            createListBuilder.add(dVar);
            String string10 = this.f35799a.getString(R.string.advertisement_network_settings);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            createListBuilder.add(new wx.e(string10));
            String c5 = a6.c();
            if (c5 != null) {
                createListBuilder.add(new wx.f("Page ID", c5));
            }
            String b4 = a6.b();
            if (b4 != null) {
                String string11 = this.f35799a.getString(R.string.app_review_status);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                createListBuilder.add(new wx.f(string11, b4));
            }
            String a7 = a6.a();
            if (a7 != null) {
                createListBuilder.add(new wx.f("app-ads.txt", a7));
            }
            createListBuilder.add(wx.b.f34223a);
        }
        iw b5 = debugPanelData.b();
        if (!b5.a().isEmpty()) {
            createListBuilder.add(dVar);
            List sortedWith = CollectionsKt.sortedWith(b5.a(), new yw());
            ArrayList arrayList = new ArrayList();
            for (Object obj : sortedWith) {
                if (((gw) obj).a() instanceof gw.a.C0190a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : sortedWith) {
                if (((gw) obj2).a() instanceof gw.a.b) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : sortedWith) {
                if (((gw) obj3).a() instanceof gw.a.c) {
                    arrayList3.add(obj3);
                }
            }
            int i4 = 0;
            if (!arrayList.isEmpty()) {
                String string12 = this.f35799a.getString(R.string.completed_integration);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                createListBuilder.add(new wx.e(string12));
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj4 = arrayList.get(i5);
                    i5++;
                    a(createListBuilder, (gw) obj4);
                }
            }
            if (!arrayList2.isEmpty()) {
                String string13 = this.f35799a.getString(R.string.invalid_integration);
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                createListBuilder.add(new wx.e(string13));
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    a(createListBuilder, (gw) obj5);
                }
            }
            if (!arrayList3.isEmpty()) {
                String string14 = this.f35799a.getString(R.string.missing_integration);
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                createListBuilder.add(new wx.e(string14));
                int size3 = arrayList3.size();
                while (i4 < size3) {
                    Object obj6 = arrayList3.get(i4);
                    i4++;
                    a(createListBuilder, (gw) obj6);
                }
            }
        }
        pw d4 = debugPanelData.d();
        wx.d dVar2 = wx.d.f34228a;
        createListBuilder.add(dVar2);
        String string15 = this.f35799a.getString(R.string.user_privacy);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        createListBuilder.add(new wx.e(string15));
        createListBuilder.add(new wx.f(this.f35799a.getString(R.string.age_restricted_user), a(d4.a()), null));
        createListBuilder.add(new wx.f(this.f35799a.getString(R.string.has_location_consent), a(Boolean.valueOf(d4.c())), null));
        createListBuilder.add(new wx.f(this.f35799a.getString(R.string.has_user_consent), a(d4.d()), null));
        String string16 = this.f35799a.getString(R.string.tcf_consent);
        if (d4.b()) {
            String string17 = this.f35799a.getString(R.string.provided);
            Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
            qxVar2 = new qx(string17, 0, null, 0, 14);
        } else {
            String string18 = this.f35799a.getString(R.string.no_value_set);
            Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
            qxVar2 = new qx(string18, 0, null, 0, 14);
        }
        createListBuilder.add(new wx.f(string16, qxVar2, null));
        ww e4 = debugPanelData.e();
        createListBuilder.add(dVar2);
        String string19 = this.f35799a.getString(R.string.features);
        Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
        createListBuilder.add(new wx.e(string19));
        wx.h.a aVar = wx.h.a.f34247b;
        createListBuilder.add(new wx.h(e4.a()));
        return CollectionsKt.build(createListBuilder);
    }
}
