package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes12.dex */
public final class NavInflater {
    private static final ThreadLocal sTmpValue = new ThreadLocal();
    private Context mContext;
    private NavigatorProvider mNavigatorProvider;

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        this.mContext = context;
        this.mNavigatorProvider = navigatorProvider;
    }

    public NavGraph inflate(int i) {
        int next;
        Resources resources = this.mContext.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        NavDestination inflate = inflate(resources, xml, asAttributeSet, i);
        if (!(inflate instanceof NavGraph)) {
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        return (NavGraph) inflate;
    }

    private NavDestination inflate(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        NavDestination createDestination = this.mNavigatorProvider.getNavigator(xmlResourceParser.getName()).createDestination();
        createDestination.onInflate(this.mContext, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    inflateArgumentForDestination(resources, createDestination, attributeSet, i);
                } else if (SDKConstants.PARAM_DEEP_LINK.equals(name)) {
                    inflateDeepLink(resources, createDestination, attributeSet);
                } else if ("action".equals(name)) {
                    inflateAction(resources, createDestination, attributeSet, xmlResourceParser, i);
                } else if (POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE.equals(name) && (createDestination instanceof NavGraph)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavInclude);
                    ((NavGraph) createDestination).addDestination(inflate(obtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                    obtainAttributes.recycle();
                } else if (createDestination instanceof NavGraph) {
                    ((NavGraph) createDestination).addDestination(inflate(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return createDestination;
    }

    private void inflateArgumentForDestination(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        navDestination.addArgument(string, inflateArgument(obtainAttributes, resources, i));
        obtainAttributes.recycle();
    }

    private void inflateArgumentForBundle(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavArgument);
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        NavArgument inflateArgument = inflateArgument(obtainAttributes, resources, i);
        if (inflateArgument.isDefaultValuePresent()) {
            inflateArgument.putDefaultValue(string, bundle);
        }
        obtainAttributes.recycle();
    }

    private NavArgument inflateArgument(TypedArray typedArray, Resources resources, int i) {
        NavArgument.Builder builder = new NavArgument.Builder();
        builder.setIsNullable(typedArray.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal threadLocal = sTmpValue;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object obj = null;
        NavType fromArgType = string != null ? NavType.fromArgType(string, resources.getResourcePackageName(i)) : null;
        if (typedArray.getValue(androidx.navigation.common.R.styleable.NavArgument_android_defaultValue, typedValue)) {
            NavType navType = NavType.ReferenceType;
            if (fromArgType == navType) {
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    obj = Integer.valueOf(i2);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    obj = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + fromArgType.getName() + ". Must be a reference to a resource.");
                }
            } else {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    if (fromArgType == null) {
                        fromArgType = navType;
                        obj = Integer.valueOf(i3);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + fromArgType.getName() + ". You must use a \"" + navType.getName() + "\" type to reference other resources.");
                    }
                } else if (fromArgType == NavType.StringType) {
                    obj = typedArray.getString(androidx.navigation.common.R.styleable.NavArgument_android_defaultValue);
                } else {
                    int i4 = typedValue.type;
                    if (i4 == 3) {
                        String charSequence = typedValue.string.toString();
                        if (fromArgType == null) {
                            fromArgType = NavType.inferFromValue(charSequence);
                        }
                        obj = fromArgType.parseValue(charSequence);
                    } else if (i4 == 4) {
                        fromArgType = checkNavType(typedValue, fromArgType, NavType.FloatType, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        fromArgType = checkNavType(typedValue, fromArgType, NavType.IntType, string, ViewHierarchyConstants.DIMENSION_KEY);
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        fromArgType = checkNavType(typedValue, fromArgType, NavType.BoolType, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else if (i4 >= 16 && i4 <= 31) {
                        NavType navType2 = NavType.FloatType;
                        if (fromArgType == navType2) {
                            fromArgType = checkNavType(typedValue, fromArgType, navType2, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            fromArgType = checkNavType(typedValue, fromArgType, NavType.IntType, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    } else {
                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                    }
                }
            }
        }
        if (obj != null) {
            builder.setDefaultValue(obj);
        }
        if (fromArgType != null) {
            builder.setType(fromArgType);
        }
        return builder.build();
    }

    private static NavType checkNavType(TypedValue typedValue, NavType navType, NavType navType2, String str, String str2) {
        if (navType == null || navType == navType2) {
            return navType != null ? navType : navType2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    private void inflateDeepLink(Resources resources, NavDestination navDestination, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavDeepLink);
        String string = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String string3 = obtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            builder.setUriPattern(string.replace("${applicationId}", this.mContext.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            builder.setAction(string2.replace("${applicationId}", this.mContext.getPackageName()));
        }
        if (string3 != null) {
            builder.setMimeType(string3.replace("${applicationId}", this.mContext.getPackageName()));
        }
        navDestination.addDeepLink(builder.build());
        obtainAttributes.recycle();
    }

    private void inflateAction(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.NavAction);
        int resourceId = obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0));
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(obtainAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        builder.setPopUpTo(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), obtainAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false));
        builder.setEnterAnim(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                inflateArgumentForBundle(resources, bundle, attributeSet, i);
            }
        }
        if (!bundle.isEmpty()) {
            navAction.setDefaultArguments(bundle);
        }
        navDestination.putAction(resourceId, navAction);
        obtainAttributes.recycle();
    }
}
