package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class fr {

    /* renamed from: a, reason: collision with root package name */
    public static a f16273a = new a(IronSourceConstants.IS_LOAD_CALLED, a("initsdk"));

    /* renamed from: b, reason: collision with root package name */
    public static a f16274b = new a(2026, a("sdkrecoverstart"));

    /* renamed from: c, reason: collision with root package name */
    public static a f16275c = new a(2002, a("createcontrollerweb"));

    /* renamed from: d, reason: collision with root package name */
    public static a f16276d = new a(2003, a("createcontrollernative"));

    /* renamed from: e, reason: collision with root package name */
    public static a f16277e = new a(IronSourceConstants.IS_CALLBACK_LOAD_SUCCESS, a("controllerstageready"));

    /* renamed from: f, reason: collision with root package name */
    public static a f16278f = new a(2005, a("loadad"));

    /* renamed from: g, reason: collision with root package name */
    public static a f16279g = new a(2006, a("loadadfailed"));

    /* renamed from: h, reason: collision with root package name */
    public static a f16280h = new a(2007, a("initproduct"));

    /* renamed from: i, reason: collision with root package name */
    public static a f16281i = new a(2008, a("initproductfailed"));

    /* renamed from: j, reason: collision with root package name */
    public static a f16282j = new a(2009, a("loadproduct"));

    /* renamed from: k, reason: collision with root package name */
    public static a f16283k = new a(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, a("parseadmfailed"));

    /* renamed from: l, reason: collision with root package name */
    public static a f16284l = new a(2011, a("loadadsuccess"));

    /* renamed from: m, reason: collision with root package name */
    public static a f16285m = new a(2027, a("destroyproduct"));

    /* renamed from: n, reason: collision with root package name */
    public static a f16286n = new a(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, a("registerad"));

    /* renamed from: o, reason: collision with root package name */
    public static a f16287o = new a(2013, a("controllerfailed"));

    /* renamed from: p, reason: collision with root package name */
    public static a f16288p = new a(2015, a("appendnativefeaturesdatafailed"));

    /* renamed from: q, reason: collision with root package name */
    public static a f16289q = new a(2016, a("adunitcouldnotloadtowebview"));

    /* renamed from: r, reason: collision with root package name */
    public static a f16290r = new a(2017, a("webviewcleanupfailed"));

    /* renamed from: s, reason: collision with root package name */
    public static a f16291s = new a(2018, a("removewebviewfailed"));

    /* renamed from: t, reason: collision with root package name */
    public static a f16292t = new a(2020, a("banneralreadydestroyed"));

    /* renamed from: u, reason: collision with root package name */
    public static a f16293u = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, a("fialedregactlifecycle"));

    /* renamed from: v, reason: collision with root package name */
    public static a f16294v = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, a("loadcontrollerhtml"));

    /* renamed from: w, reason: collision with root package name */
    public static a f16295w = new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, a("controllerhtmlsuccess"));

    /* renamed from: x, reason: collision with root package name */
    public static a f16296x = new a(2024, a("controllerhtmlfailed"));

    /* renamed from: y, reason: collision with root package name */
    public static a f16297y = new a(2025, a("webviewcrashrpg"));

    /* renamed from: z, reason: collision with root package name */
    public static a f16298z = new a(2031, a("getorientationcalled"));

    /* renamed from: A, reason: collision with root package name */
    public static a f16271A = new a(2032, a("webviewunavailable"));

    /* renamed from: B, reason: collision with root package name */
    public static final a f16272B = new a(2033, a("controller_init_delayed"));

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f16299a;

        /* renamed from: b, reason: collision with root package name */
        int f16300b;

        a(int i4, String str) {
            this.f16300b = i4;
            this.f16299a = str;
        }
    }

    static String a(String str) {
        return cc.f15731c + str;
    }
}
