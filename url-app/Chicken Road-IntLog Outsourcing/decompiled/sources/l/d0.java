package l;

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
import b2.AbstractC0279e;
import com.chickyneer.roadway.R;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import v.AbstractC1485a;

/* loaded from: classes.dex */
public final class d0 extends J.c implements View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f10839y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f10840i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10841j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f10842k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f10843l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f10844m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f10845n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f10846o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10847p;

    /* renamed from: q, reason: collision with root package name */
    public int f10848q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f10849r;

    /* renamed from: s, reason: collision with root package name */
    public int f10850s;

    /* renamed from: t, reason: collision with root package name */
    public int f10851t;

    /* renamed from: u, reason: collision with root package name */
    public int f10852u;

    /* renamed from: v, reason: collision with root package name */
    public int f10853v;

    /* renamed from: w, reason: collision with root package name */
    public int f10854w;

    /* renamed from: x, reason: collision with root package name */
    public int f10855x;

    public d0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1339b = true;
        this.f1340c = null;
        this.f1338a = false;
        this.f1341d = context;
        this.f1342e = -1;
        this.f1343f = new J.a(this);
        this.f1344g = new J.b(0, this);
        this.f10841j = suggestionRowLayout;
        this.f10840i = suggestionRowLayout;
        this.f10842k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f10848q = 1;
        this.f10850s = -1;
        this.f10851t = -1;
        this.f10852u = -1;
        this.f10853v = -1;
        this.f10854w = -1;
        this.f10855x = -1;
        this.f10843l = searchView;
        this.f10844m = searchableInfo;
        this.f10847p = searchView.getSuggestionCommitIconResId();
        this.f10845n = context;
        this.f10846o = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    @Override // J.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        Drawable f3;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        c0 c0Var = (c0) view.getTag();
        int i2 = this.f10855x;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = c0Var.f10834a;
        if (textView != null) {
            String h3 = h(cursor, this.f10850s);
            textView.setText(h3);
            if (TextUtils.isEmpty(h3)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        TextView textView2 = c0Var.f10835b;
        if (textView2 != null) {
            String h6 = h(cursor, this.f10852u);
            if (h6 != null) {
                if (this.f10849r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f1341d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f10849r = this.f1341d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h6);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f10849r, null), 0, h6.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f10851t);
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
        ImageView imageView = c0Var.f10836c;
        if (imageView != null) {
            int i6 = this.f10853v;
            if (i6 == -1) {
                f3 = null;
            } else {
                f3 = f(cursor.getString(i6));
                if (f3 == null) {
                    ComponentName searchActivity = this.f10844m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f10846o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f3 = constantState == null ? null : constantState.newDrawable(this.f10845n.getResources());
                    } else {
                        PackageManager packageManager = this.f1341d.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.w("SuggestionsAdapter", e3.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder i7 = AbstractC0279e.i(iconResource, "Invalid icon resource ", " for ");
                                i7.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", i7.toString());
                            } else {
                                f3 = drawable;
                                weakHashMap.put(flattenToShortString, f3 != null ? null : f3.getConstantState());
                            }
                        }
                        f3 = null;
                        weakHashMap.put(flattenToShortString, f3 != null ? null : f3.getConstantState());
                    }
                    if (f3 == null) {
                        f3 = this.f1341d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(f3);
            if (f3 == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                f3.setVisible(false, false);
                f3.setVisible(true, false);
            }
        }
        ImageView imageView2 = c0Var.f10837d;
        if (imageView2 != null) {
            int i8 = this.f10854w;
            Drawable f6 = i8 == -1 ? null : f(cursor.getString(i8));
            imageView2.setImageDrawable(f6);
            if (f6 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                f6.setVisible(false, false);
                f6.setVisible(true, false);
            }
        }
        int i9 = this.f10848q;
        ImageView imageView3 = c0Var.f10838e;
        if (i9 != 2 && (i9 != 1 || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // J.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f10850s = cursor.getColumnIndex("suggest_text_1");
                this.f10851t = cursor.getColumnIndex("suggest_text_2");
                this.f10852u = cursor.getColumnIndex("suggest_text_2_url");
                this.f10853v = cursor.getColumnIndex("suggest_icon_1");
                this.f10854w = cursor.getColumnIndex("suggest_icon_2");
                this.f10855x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // J.c
    public final String c(Cursor cursor) {
        String h3;
        String h6;
        if (cursor == null) {
            return null;
        }
        String h7 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h7 != null) {
            return h7;
        }
        SearchableInfo searchableInfo = this.f10844m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h6 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h6;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h3 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h3;
    }

    @Override // J.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f10842k.inflate(this.f10840i, viewGroup, false);
        inflate.setTag(new c0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f10847p);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1341d.getPackageManager().getResourcesForApplication(authority);
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
        WeakHashMap weakHashMap = this.f10846o;
        Context context = this.f10845n;
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
                Drawable b6 = AbstractC1485a.b(context, parseInt);
                if (b6 != null) {
                    weakHashMap.put(str2, b6.getConstantState());
                }
                return b6;
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
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e3.getMessage());
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
                        } catch (IOException e6) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e6);
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
        return this.f1341d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // J.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View inflate = this.f10842k.inflate(this.f10841j, viewGroup, false);
            if (inflate != null) {
                ((c0) inflate.getTag()).f10834a.setText(e3.toString());
            }
            return inflate;
        }
    }

    @Override // J.c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View d6 = d(viewGroup);
            ((c0) d6.getTag()).f10834a.setText(e3.toString());
            return d6;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1340c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1340c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f10843l.n((CharSequence) tag);
        }
    }
}
