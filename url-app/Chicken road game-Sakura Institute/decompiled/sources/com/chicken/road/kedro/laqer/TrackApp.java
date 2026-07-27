package com.chicken.road.kedro.laqer;

import J2.k;
import Q.v;
import V1.f;
import android.app.Application;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.o;
import org.json.JSONArray;
import org.json.JSONObject;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import z1.AbstractC1366J;
import z1.C1369M;

@Metadata
/* loaded from: classes.dex */
public class TrackApp extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        File file = AbstractC1366J.f11815a;
        Intrinsics.checkNotNullParameter(this, "ctx");
        File file2 = new File(getFilesDir(), "trackrun.json");
        AbstractC1366J.f11815a = file2;
        if (file2.exists()) {
            try {
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                File file3 = AbstractC1366J.f11815a;
                if (file3 == null) {
                    Intrinsics.g("file");
                    throw null;
                }
                JSONObject jSONObject = new JSONObject(k.a(file3));
                JSONArray optJSONArray = jSONObject.optJSONArray("tournaments");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        v vVar = AbstractC1366J.f11816b;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                        vVar.add(o.m(jSONObject2));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("events");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        v vVar2 = AbstractC1366J.f11817c;
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i4);
                        Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
                        vVar2.add(o.h(jSONObject3));
                    }
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("athletes");
                if (optJSONArray3 != null) {
                    int length3 = optJSONArray3.length();
                    for (int i5 = 0; i5 < length3; i5++) {
                        v vVar3 = AbstractC1366J.f11818d;
                        JSONObject jSONObject4 = optJSONArray3.getJSONObject(i5);
                        Intrinsics.checkNotNullExpressionValue(jSONObject4, "getJSONObject(...)");
                        vVar3.add(o.f(jSONObject4));
                    }
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("teams");
                if (optJSONArray4 != null) {
                    int length4 = optJSONArray4.length();
                    for (int i6 = 0; i6 < length4; i6++) {
                        v vVar4 = AbstractC1366J.f11819e;
                        JSONObject jSONObject5 = optJSONArray4.getJSONObject(i6);
                        Intrinsics.checkNotNullExpressionValue(jSONObject5, "getJSONObject(...)");
                        String string = jSONObject5.getString("id");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        String string2 = jSONObject5.getString("name");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String string3 = jSONObject5.getString("village");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        vVar4.add(new C1369M(string, string2, string3, jSONObject5.optLong("color", 4289755702L)));
                    }
                }
                JSONArray optJSONArray5 = jSONObject.optJSONArray("heats");
                if (optJSONArray5 != null) {
                    int length5 = optJSONArray5.length();
                    for (int i7 = 0; i7 < length5; i7++) {
                        v vVar5 = AbstractC1366J.f11820f;
                        JSONObject jSONObject6 = optJSONArray5.getJSONObject(i7);
                        Intrinsics.checkNotNullExpressionValue(jSONObject6, "getJSONObject(...)");
                        vVar5.add(o.j(jSONObject6));
                    }
                }
                JSONArray optJSONArray6 = jSONObject.optJSONArray("boards");
                if (optJSONArray6 != null) {
                    int length6 = optJSONArray6.length();
                    for (int i8 = 0; i8 < length6; i8++) {
                        v vVar6 = AbstractC1366J.f11821g;
                        JSONObject jSONObject7 = optJSONArray6.getJSONObject(i8);
                        Intrinsics.checkNotNullExpressionValue(jSONObject7, "getJSONObject(...)");
                        vVar6.add(o.i(jSONObject7));
                    }
                }
                JSONArray optJSONArray7 = jSONObject.optJSONArray("relays");
                if (optJSONArray7 != null) {
                    int length7 = optJSONArray7.length();
                    for (int i9 = 0; i9 < length7; i9++) {
                        v vVar7 = AbstractC1366J.f11822h;
                        JSONObject jSONObject8 = optJSONArray7.getJSONObject(i9);
                        Intrinsics.checkNotNullExpressionValue(jSONObject8, "getJSONObject(...)");
                        vVar7.add(o.l(jSONObject8));
                    }
                }
                JSONArray optJSONArray8 = jSONObject.optJSONArray("records");
                if (optJSONArray8 != null) {
                    int length8 = optJSONArray8.length();
                    for (int i10 = 0; i10 < length8; i10++) {
                        v vVar8 = AbstractC1366J.f11823i;
                        JSONObject jSONObject9 = optJSONArray8.getJSONObject(i10);
                        Intrinsics.checkNotNullExpressionValue(jSONObject9, "getJSONObject(...)");
                        vVar8.add(o.k(jSONObject9));
                    }
                }
                JSONArray optJSONArray9 = jSONObject.optJSONArray("training");
                if (optJSONArray9 != null) {
                    int length9 = optJSONArray9.length();
                    for (int i11 = 0; i11 < length9; i11++) {
                        v vVar9 = AbstractC1366J.f11824j;
                        JSONObject jSONObject10 = optJSONArray9.getJSONObject(i11);
                        Intrinsics.checkNotNullExpressionValue(jSONObject10, "getJSONObject(...)");
                        vVar9.add(o.n(jSONObject10));
                    }
                }
                JSONArray optJSONArray10 = jSONObject.optJSONArray("pbs");
                if (optJSONArray10 != null) {
                    int length10 = optJSONArray10.length();
                    for (int i12 = 0; i12 < length10; i12++) {
                        v vVar10 = AbstractC1366J.f11825k;
                        JSONObject jSONObject11 = optJSONArray10.getJSONObject(i12);
                        Intrinsics.checkNotNullExpressionValue(jSONObject11, "getJSONObject(...)");
                        vVar10.add(o.g(jSONObject11));
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("onboarding");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        AbstractC1366J.f11826l.put(next, Boolean.valueOf(optJSONObject.optBoolean(next)));
                    }
                    Unit unit = Unit.f7487a;
                }
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            } catch (Throwable th) {
                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                AbstractC1343r.a(th);
            }
        }
        Intrinsics.checkNotNullParameter(this, "app");
        try {
            AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
            f.e(this);
        } catch (Throwable th2) {
            AbstractC1341p.a aVar5 = AbstractC1341p.f11673d;
            AbstractC1343r.a(th2);
        }
    }
}
