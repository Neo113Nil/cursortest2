package com.onevcat.uniwebview.internal.obfuscated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r {
    public static C0132z a(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Float f = null;
        if (json.length() == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(json);
            boolean z = true;
            if (jSONObject.optInt("version", 1) != 1) {
                return null;
            }
            boolean optBoolean = jSONObject.optBoolean("visible", true);
            String optString = jSONObject.optString("position", "top");
            Intrinsics.checkNotNullExpressionValue(optString, "obj.optString(\"position\", \"top\")");
            String lowerCase = optString.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            EnumC0116v enumC0116v = Intrinsics.areEqual(lowerCase, "bottom") ? EnumC0116v.Bottom : EnumC0116v.Top;
            if (jSONObject.has("maxHeight") && !jSONObject.isNull("maxHeight")) {
                f = Float.valueOf((float) jSONObject.optDouble("maxHeight"));
            }
            Float f2 = f;
            C0093p a = a(jSONObject.optJSONObject("backgroundColor"));
            if (a == null) {
                a = C0132z.k;
            }
            C0093p c0093p = a;
            C0093p a2 = a(jSONObject.optJSONObject("buttonTextColor"));
            if (a2 == null) {
                a2 = C0132z.l;
            }
            C0093p c0093p2 = a2;
            C0093p a3 = a(jSONObject.optJSONObject("titleTextColor"));
            if (a3 == null) {
                a3 = C0132z.m;
            }
            C0093p c0093p3 = a3;
            List a4 = a(jSONObject.optJSONArray("left"));
            List a5 = a(jSONObject.optJSONArray("center"));
            List a6 = a(jSONObject.optJSONArray("right"));
            if ((jSONObject.has("left") || jSONObject.has("right") || jSONObject.has("center")) && !a(a4) && !a(a5) && !a(a6)) {
                z = false;
            }
            return new C0132z(optBoolean, enumC0116v, f2, c0093p, c0093p2, c0093p3, a4, a5, a6, z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static List a(JSONArray jSONArray) {
        EnumC0089o kind;
        int i;
        int i2;
        String identifier;
        C0120w c0120w;
        C0104s c0104s;
        Object opt;
        Object opt2;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2 == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray2.length();
        int i3 = 0;
        while (i3 < length) {
            JSONObject optJSONObject = jSONArray2.optJSONObject(i3);
            if (optJSONObject == null) {
                i = length;
                i2 = i3;
            } else {
                String optString = optJSONObject.optString("type");
                Intrinsics.checkNotNullExpressionValue(optString, "item.optString(\"type\")");
                Locale locale = Locale.ROOT;
                String lowerCase = optString.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                EnumC0112u enumC0112u = Intrinsics.areEqual(lowerCase, "custom") ? EnumC0112u.Custom : EnumC0112u.BuiltIn;
                String optString2 = optJSONObject.optString("kind");
                Intrinsics.checkNotNullExpressionValue(optString2, "item.optString(\"kind\")");
                String lowerCase2 = optString2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                switch (lowerCase2.hashCode()) {
                    case -934641255:
                        if (lowerCase2.equals("reload")) {
                            kind = EnumC0089o.Reload;
                            break;
                        }
                        kind = null;
                        break;
                    case -677145915:
                        if (lowerCase2.equals("forward")) {
                            kind = EnumC0089o.Forward;
                            break;
                        }
                        kind = null;
                        break;
                    case 3015911:
                        if (lowerCase2.equals("back")) {
                            kind = EnumC0089o.Back;
                            break;
                        }
                        kind = null;
                        break;
                    case 3089282:
                        if (lowerCase2.equals("done")) {
                            kind = EnumC0089o.Done;
                            break;
                        }
                        kind = null;
                        break;
                    case 110371416:
                        if (lowerCase2.equals("title")) {
                            kind = EnumC0089o.Title;
                            break;
                        }
                        kind = null;
                        break;
                    default:
                        kind = null;
                        break;
                }
                String identifier2 = optJSONObject.optString("identifier", "");
                Intrinsics.checkNotNullExpressionValue(identifier2, "identifier");
                i = length;
                i2 = i3;
                if (identifier2.length() == 0 && enumC0112u == EnumC0112u.BuiltIn && kind != null) {
                    Intrinsics.checkNotNullParameter(kind, "kind");
                    int ordinal = kind.ordinal();
                    if (ordinal == 0) {
                        identifier = "uwv.toolbar.back";
                    } else if (ordinal == 1) {
                        identifier = "uwv.toolbar.forward";
                    } else if (ordinal == 2) {
                        identifier = "uwv.toolbar.done";
                    } else if (ordinal == 3) {
                        identifier = "uwv.toolbar.reload";
                    } else {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        identifier = "uwv.toolbar.title";
                    }
                } else {
                    identifier = identifier2;
                }
                EnumC0112u enumC0112u2 = EnumC0112u.BuiltIn;
                if (enumC0112u == enumC0112u2 && kind == null) {
                    Intrinsics.checkNotNullExpressionValue(identifier, "identifier");
                    if (identifier.length() > 0) {
                        Intrinsics.checkNotNullExpressionValue(identifier, "identifier");
                        switch (identifier.hashCode()) {
                            case -1676168570:
                                if (identifier.equals("uwv.toolbar.reload")) {
                                    kind = EnumC0089o.Reload;
                                    break;
                                }
                                kind = null;
                                break;
                            case -1021927477:
                                if (identifier.equals("uwv.toolbar.title")) {
                                    kind = EnumC0089o.Title;
                                    break;
                                }
                                kind = null;
                                break;
                            case -310604524:
                                if (identifier.equals("uwv.toolbar.back")) {
                                    kind = EnumC0089o.Back;
                                    break;
                                }
                                kind = null;
                                break;
                            case -310531153:
                                if (identifier.equals("uwv.toolbar.done")) {
                                    kind = EnumC0089o.Done;
                                    break;
                                }
                                kind = null;
                                break;
                            case 2105311096:
                                if (identifier.equals("uwv.toolbar.forward")) {
                                    kind = EnumC0089o.Forward;
                                    break;
                                }
                                kind = null;
                                break;
                            default:
                                kind = null;
                                break;
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(identifier, "identifier");
                if (identifier.length() == 0) {
                    c0104s = null;
                } else {
                    String obj = (!optJSONObject.has("title") || optJSONObject.isNull("title") || (opt2 = optJSONObject.opt("title")) == null) ? null : opt2.toString();
                    Boolean valueOf = (enumC0112u == enumC0112u2 && optJSONObject.has("visible") && !optJSONObject.isNull("visible")) ? Boolean.valueOf(optJSONObject.optBoolean("visible", true)) : null;
                    Intrinsics.checkNotNullExpressionValue(identifier, "identifier");
                    EnumC0089o enumC0089o = enumC0112u == enumC0112u2 ? kind : null;
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("style");
                    C0108t c0108t = optJSONObject2 == null ? null : new C0108t(a(optJSONObject2.optJSONObject("textColor")));
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("titleInteraction");
                    if (optJSONObject3 != null && enumC0112u == enumC0112u2 && kind == EnumC0089o.Title) {
                        String optString3 = optJSONObject3.optString("onTap", "none");
                        Intrinsics.checkNotNullExpressionValue(optString3, "obj.optString(\"onTap\", \"none\")");
                        String lowerCase3 = optString3.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        EnumC0128y enumC0128y = Intrinsics.areEqual(lowerCase3, "scrolltotop") ? EnumC0128y.ScrollToTop : EnumC0128y.None;
                        String optString4 = optJSONObject3.optString("onLongPress", "none");
                        Intrinsics.checkNotNullExpressionValue(optString4, "obj.optString(\"onLongPress\", \"none\")");
                        String lowerCase4 = optString4.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        c0120w = new C0120w(enumC0128y, Intrinsics.areEqual(lowerCase4, "copyurl") ? EnumC0124x.CopyUrl : EnumC0124x.None, (!optJSONObject3.has("copyToastText") || optJSONObject3.isNull("copyToastText") || (opt = optJSONObject3.opt("copyToastText")) == null) ? null : opt.toString());
                    } else {
                        c0120w = null;
                    }
                    c0104s = new C0104s(enumC0112u, identifier, enumC0089o, obj, valueOf, c0108t, c0120w);
                }
                if (c0104s != null) {
                    arrayList.add(c0104s);
                }
            }
            i3 = i2 + 1;
            jSONArray2 = jSONArray;
            length = i;
        }
        return arrayList;
    }

    public static C0093p a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("r") || !jSONObject.has("g") || !jSONObject.has("b") || !jSONObject.has("a") || jSONObject.isNull("r") || jSONObject.isNull("g") || jSONObject.isNull("b") || jSONObject.isNull("a")) {
            return null;
        }
        return new C0093p((float) jSONObject.optDouble("r"), (float) jSONObject.optDouble("g"), (float) jSONObject.optDouble("b"), (float) jSONObject.optDouble("a"));
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0104s c0104s = (C0104s) it.next();
            if (c0104s.a == EnumC0112u.BuiltIn && !Intrinsics.areEqual(c0104s.e, Boolean.FALSE)) {
                EnumC0089o enumC0089o = c0104s.c;
                int i = enumC0089o == null ? -1 : AbstractC0097q.a[enumC0089o.ordinal()];
                if (i == 1 || i == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
