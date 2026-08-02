package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ain {
    public static final /* synthetic */ int a = 0;
    private static final Class[] b = {Context.class, AttributeSet.class};
    private static final HashMap c = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r9 = r0;
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002f, code lost:
    
        r8 = r0;
        r5 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Preference a(XmlPullParser xmlPullParser, Context context, Object[] objArr, air airVar, String[] strArr) {
        XmlPullParser xmlPullParser2;
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (objArr) {
            try {
                try {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    objArr[0] = context;
                    do {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                preferenceGroup = (PreferenceGroup) d(xmlPullParser.getName(), asAttributeSet, context, objArr, strArr);
                                preferenceGroup.z(airVar);
                                xmlPullParser2 = xmlPullParser;
                                try {
                                    b(xmlPullParser2, preferenceGroup, asAttributeSet, context, objArr, airVar, strArr);
                                } catch (InflateException e) {
                                    e = e;
                                    throw e;
                                } catch (IOException e2) {
                                    e = e2;
                                    IOException iOException = e;
                                    InflateException inflateException = new InflateException(xmlPullParser2.getPositionDescription() + ": " + iOException.getMessage());
                                    inflateException.initCause(iOException);
                                    throw inflateException;
                                } catch (XmlPullParserException e3) {
                                    e = e3;
                                    XmlPullParserException xmlPullParserException = e;
                                    InflateException inflateException2 = new InflateException(xmlPullParserException.getMessage());
                                    inflateException2.initCause(xmlPullParserException);
                                    throw inflateException2;
                                }
                            }
                        } catch (InflateException e4) {
                            e = e4;
                        } catch (IOException e5) {
                            e = e5;
                            xmlPullParser2 = xmlPullParser;
                        } catch (XmlPullParserException e6) {
                            e = e6;
                        }
                    } while (next != 1);
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                Object[] objArr2 = objArr;
                Throwable th22 = th;
                throw th22;
            }
        }
        return preferenceGroup;
    }

    private static final void b(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet, Context context, Object[] objArr, air airVar, String[] strArr) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                } else {
                    next = 3;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.t = Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, preference.q());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference d = d(name, attributeSet, context, objArr, strArr);
                    ((PreferenceGroup) preference).X(d);
                    b(xmlPullParser, d, attributeSet, context, objArr, airVar, strArr);
                }
            }
        }
    }

    private static final Preference c(String str, String[] strArr, AttributeSet attributeSet, Context context, Object[] objArr) {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) c.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (strArr != null) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (int i = 0; i < 2; i++) {
                            try {
                                cls = Class.forName(strArr[i] + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(a.ad(str, attributeSet, ": Error inflating class "));
                            }
                            throw e;
                        }
                    } else {
                        cls = Class.forName(str, false, classLoader);
                    }
                    constructor = cls.getConstructor(b);
                    constructor.setAccessible(true);
                    c.put(str, constructor);
                } catch (ClassNotFoundException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                InflateException inflateException = new InflateException(a.ad(str, attributeSet, ": Error inflating class "));
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private static final Preference d(String str, AttributeSet attributeSet, Context context, Object[] objArr, String[] strArr) {
        try {
            return str.indexOf(46) == -1 ? c(str, strArr, attributeSet, context, objArr) : c(str, null, attributeSet, context, objArr);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(a.ad(str, attributeSet, ": Error inflating class (not found)"));
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(a.ad(str, attributeSet, ": Error inflating class "));
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }
}
