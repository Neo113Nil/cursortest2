package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.AbstractC2405a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class T extends L.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    private final SearchView f10805l;

    /* renamed from: m, reason: collision with root package name */
    private final SearchableInfo f10806m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f10807n;

    /* renamed from: o, reason: collision with root package name */
    private final WeakHashMap f10808o;

    /* renamed from: p, reason: collision with root package name */
    private final int f10809p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10810q;

    /* renamed from: r, reason: collision with root package name */
    private int f10811r;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f10812s;

    /* renamed from: t, reason: collision with root package name */
    private int f10813t;

    /* renamed from: u, reason: collision with root package name */
    private int f10814u;

    /* renamed from: v, reason: collision with root package name */
    private int f10815v;

    /* renamed from: w, reason: collision with root package name */
    private int f10816w;

    /* renamed from: x, reason: collision with root package name */
    private int f10817x;

    /* renamed from: y, reason: collision with root package name */
    private int f10818y;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f10819a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f10820b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f10821c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f10822d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f10823e;

        public a(View view) {
            this.f10819a = (TextView) view.findViewById(R.id.text1);
            this.f10820b = (TextView) view.findViewById(R.id.text2);
            this.f10821c = (ImageView) view.findViewById(R.id.icon1);
            this.f10822d = (ImageView) view.findViewById(R.id.icon2);
            this.f10823e = (ImageView) view.findViewById(e.f.f36312q);
        }
    }

    public T(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f10810q = false;
        this.f10811r = 1;
        this.f10813t = -1;
        this.f10814u = -1;
        this.f10815v = -1;
        this.f10816w = -1;
        this.f10817x = -1;
        this.f10818y = -1;
        this.f10805l = searchView;
        this.f10806m = searchableInfo;
        this.f10809p = searchView.getSuggestionCommitIconResId();
        this.f10807n = context;
        this.f10808o = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f10808o.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10808o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f10812s == null) {
            TypedValue typedValue = new TypedValue();
            this.f10807n.getTheme().resolveAttribute(AbstractC2405a.f36184K, typedValue, true);
            this.f10812s = this.f10807n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f10812s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f10807n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, UserVerificationMethods.USER_VERIFY_PATTERN);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("SuggestionsAdapter", e4.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f10808o.containsKey(flattenToShortString)) {
            Drawable m4 = m(componentName);
            this.f10808o.put(flattenToShortString, m4 != null ? m4.getConstantState() : null);
            return m4;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10808o.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f10807n.getResources());
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable n4 = n(this.f10806m.getSearchActivity());
        return n4 != null ? n4 : this.f10807n.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f10807n.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    return createFromStream;
                } catch (IOException e4) {
                    return createFromStream;
                }
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e42) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e42);
                }
            }
        } catch (FileNotFoundException e5) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f10807n.getPackageName() + "/" + parseInt;
            Drawable k4 = k(str2);
            if (k4 != null) {
                return k4;
            }
            Drawable g4 = androidx.core.content.a.g(this.f10807n, parseInt);
            A(str2, g4);
            return g4;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k5 = k(str);
            if (k5 != null) {
                return k5;
            }
            Drawable q4 = q(Uri.parse(str));
            A(str, q4);
            return q4;
        }
    }

    private Drawable t(Cursor cursor) {
        int i4 = this.f10816w;
        if (i4 == -1) {
            return null;
        }
        Drawable s4 = s(cursor.getString(i4));
        return s4 != null ? s4 : p();
    }

    private Drawable u(Cursor cursor) {
        int i4 = this.f10817x;
        if (i4 == -1) {
            return null;
        }
        return s(cursor.getString(i4));
    }

    private static String w(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i4) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i4);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // L.a, L.b.a
    public void a(Cursor cursor) {
        if (this.f10810q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f10813t = cursor.getColumnIndex("suggest_text_1");
                this.f10814u = cursor.getColumnIndex("suggest_text_2");
                this.f10815v = cursor.getColumnIndex("suggest_text_2_url");
                this.f10816w = cursor.getColumnIndex("suggest_icon_1");
                this.f10817x = cursor.getColumnIndex("suggest_icon_2");
                this.f10818y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // L.a, L.b.a
    public CharSequence c(Cursor cursor) {
        String o4;
        String o5;
        if (cursor == null) {
            return null;
        }
        String o6 = o(cursor, "suggest_intent_query");
        if (o6 != null) {
            return o6;
        }
        if (this.f10806m.shouldRewriteQueryFromData() && (o5 = o(cursor, "suggest_intent_data")) != null) {
            return o5;
        }
        if (!this.f10806m.shouldRewriteQueryFromText() || (o4 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o4;
    }

    @Override // L.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f10805l.getVisibility() == 0 && this.f10805l.getWindowVisibility() == 0) {
            try {
                Cursor v4 = v(this.f10806m, charSequence2, 50);
                if (v4 != null) {
                    v4.getCount();
                    return v4;
                }
            } catch (RuntimeException e4) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e4);
            }
        }
        return null;
    }

    @Override // L.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i4 = this.f10818y;
        int i5 = i4 != -1 ? cursor.getInt(i4) : 0;
        if (aVar.f10819a != null) {
            z(aVar.f10819a, w(cursor, this.f10813t));
        }
        if (aVar.f10820b != null) {
            String w4 = w(cursor, this.f10815v);
            CharSequence l4 = w4 != null ? l(w4) : w(cursor, this.f10814u);
            if (TextUtils.isEmpty(l4)) {
                TextView textView = aVar.f10819a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f10819a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f10819a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f10819a.setMaxLines(1);
                }
            }
            z(aVar.f10820b, l4);
        }
        ImageView imageView = aVar.f10821c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f10822d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i6 = this.f10811r;
        if (i6 != 2 && (i6 != 1 || (i5 & 1) == 0)) {
            aVar.f10823e.setVisibility(8);
            return;
        }
        aVar.f10823e.setVisibility(0);
        aVar.f10823e.setTag(aVar.f10819a.getText());
        aVar.f10823e.setOnClickListener(this);
    }

    @Override // L.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View g4 = g(this.f10807n, b(), viewGroup);
            if (g4 != null) {
                ((a) g4.getTag()).f10819a.setText(e4.toString());
            }
            return g4;
        }
    }

    @Override // L.a, android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View h4 = h(this.f10807n, b(), viewGroup);
            if (h4 != null) {
                ((a) h4.getTag()).f10819a.setText(e4.toString());
            }
            return h4;
        }
    }

    @Override // L.c, L.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h4 = super.h(context, cursor, viewGroup);
        h4.setTag(new a(h4));
        ((ImageView) h4.findViewById(e.f.f36312q)).setImageResource(this.f10809p);
        return h4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f10805l.z((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f10807n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i4) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i4 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i4));
        }
        return this.f10807n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i4) {
        this.f10811r = i4;
    }
}
