package k;

import E.AbstractC0005f;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.rockchicken.pump.up.road.R;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: k.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1209d0 extends I.c implements View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f13985y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f13986i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13987j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f13988k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f13989l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f13990m;
    public final Context n;
    public final WeakHashMap o;

    /* renamed from: p, reason: collision with root package name */
    public final int f13991p;

    /* renamed from: q, reason: collision with root package name */
    public int f13992q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f13993r;

    /* renamed from: s, reason: collision with root package name */
    public int f13994s;

    /* renamed from: t, reason: collision with root package name */
    public int f13995t;

    /* renamed from: u, reason: collision with root package name */
    public int f13996u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f13997w;

    /* renamed from: x, reason: collision with root package name */
    public int f13998x;

    public ViewOnClickListenerC1209d0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1113b = true;
        this.f1114c = null;
        this.f1112a = false;
        this.f1115d = context;
        this.f1116e = -1;
        this.f1117f = new I.a(this);
        this.f1118g = new I.b(0, this);
        this.f13987j = suggestionRowLayout;
        this.f13986i = suggestionRowLayout;
        this.f13988k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f13992q = 1;
        this.f13994s = -1;
        this.f13995t = -1;
        this.f13996u = -1;
        this.v = -1;
        this.f13997w = -1;
        this.f13998x = -1;
        this.f13989l = searchView;
        this.f13990m = searchableInfo;
        this.f13991p = searchView.getSuggestionCommitIconResId();
        this.n = context;
        this.o = weakHashMap;
    }

    public static String h(Cursor cursor, int i4) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    @Override // I.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i4;
        int i5;
        Drawable f4;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        C1207c0 c1207c0 = (C1207c0) view.getTag();
        int i6 = this.f13998x;
        int i7 = i6 != -1 ? cursor.getInt(i6) : 0;
        TextView textView = c1207c0.f13980a;
        TextView textView2 = c1207c0.f13981b;
        ImageView imageView = c1207c0.f13984e;
        if (textView != null) {
            String h2 = h(cursor, this.f13994s);
            textView.setText(h2);
            if (TextUtils.isEmpty(h2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (textView2 != null) {
            String h4 = h(cursor, this.f13996u);
            if (h4 != null) {
                if (this.f13993r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f1115d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f13993r = this.f1115d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h4);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f13993r, null), 0, h4.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f13995t);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = c1207c0.f13982c;
        if (imageView2 != null) {
            int i8 = this.v;
            if (i8 == -1) {
                f4 = null;
            } else {
                f4 = f(cursor.getString(i8));
                if (f4 == null) {
                    ComponentName searchActivity = this.f13990m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f4 = constantState == null ? null : constantState.newDrawable(this.n.getResources());
                    } else {
                        PackageManager packageManager = this.f1115d.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.w("SuggestionsAdapter", e4.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder r4 = AbstractC0005f.r(iconResource, "Invalid icon resource ", " for ");
                                r4.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", r4.toString());
                            } else {
                                f4 = drawable;
                                weakHashMap.put(flattenToShortString, f4 != null ? null : f4.getConstantState());
                            }
                        }
                        f4 = null;
                        weakHashMap.put(flattenToShortString, f4 != null ? null : f4.getConstantState());
                    }
                    if (f4 == null) {
                        f4 = this.f1115d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f4);
            if (f4 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f4.setVisible(false, false);
                f4.setVisible(true, false);
            }
        }
        ImageView imageView3 = c1207c0.f13983d;
        if (imageView3 != null) {
            int i9 = this.f13997w;
            Drawable f5 = i9 == -1 ? null : f(cursor.getString(i9));
            imageView3.setImageDrawable(f5);
            if (f5 != null) {
                imageView3.setVisibility(0);
                f5.setVisible(false, false);
                i4 = 1;
                f5.setVisible(true, false);
                i5 = this.f13992q;
                if (i5 == 2 && (i5 != i4 || (i7 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i4 = 1;
        i5 = this.f13992q;
        if (i5 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // I.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f13994s = cursor.getColumnIndex("suggest_text_1");
                this.f13995t = cursor.getColumnIndex("suggest_text_2");
                this.f13996u = cursor.getColumnIndex("suggest_text_2_url");
                this.v = cursor.getColumnIndex("suggest_icon_1");
                this.f13997w = cursor.getColumnIndex("suggest_icon_2");
                this.f13998x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // I.c
    public final String c(Cursor cursor) {
        String h2;
        String h4;
        if (cursor == null) {
            return null;
        }
        String h5 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h5 != null) {
            return h5;
        }
        SearchableInfo searchableInfo = this.f13990m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h4 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h4;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    @Override // I.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f13988k.inflate(this.f13986i, viewGroup, false);
        inflate.setTag(new C1207c0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f13991p);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1115d.getPackageManager().getResourcesForApplication(authority);
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.o;
        Context context = this.n;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !CommonUrlParts.Values.FALSE_INTEGER.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e4) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e4.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e5) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e5);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } finally {
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
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
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1115d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // I.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View inflate = this.f13988k.inflate(this.f13987j, viewGroup, false);
            if (inflate != null) {
                ((C1207c0) inflate.getTag()).f13980a.setText(e4.toString());
            }
            return inflate;
        }
    }

    @Override // I.c, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View d4 = d(viewGroup);
            ((C1207c0) d4.getTag()).f13980a.setText(e4.toString());
            return d4;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1114c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1114c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f13989l.n((CharSequence) tag);
        }
    }
}
