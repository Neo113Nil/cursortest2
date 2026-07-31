package k;

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
import com.strategylink.Row.Five.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import u.AbstractC0666a;

/* loaded from: classes.dex */
public final class j0 extends J.b implements View.OnClickListener {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f5029C = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f5030A;

    /* renamed from: B, reason: collision with root package name */
    public int f5031B;

    /* renamed from: m, reason: collision with root package name */
    public final int f5032m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5033n;

    /* renamed from: o, reason: collision with root package name */
    public final LayoutInflater f5034o;

    /* renamed from: p, reason: collision with root package name */
    public final SearchView f5035p;

    /* renamed from: q, reason: collision with root package name */
    public final SearchableInfo f5036q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f5037r;

    /* renamed from: s, reason: collision with root package name */
    public final WeakHashMap f5038s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5039t;

    /* renamed from: u, reason: collision with root package name */
    public int f5040u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f5041v;

    /* renamed from: w, reason: collision with root package name */
    public int f5042w;

    /* renamed from: x, reason: collision with root package name */
    public int f5043x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f5044z;

    public j0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1231g = true;
        this.f1232h = null;
        this.f1230f = false;
        this.f1233i = -1;
        this.f1234j = new D3.q(this);
        this.f1235k = new J.a(0, this);
        this.f5033n = suggestionRowLayout;
        this.f5032m = suggestionRowLayout;
        this.f5034o = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f5040u = 1;
        this.f5042w = -1;
        this.f5043x = -1;
        this.y = -1;
        this.f5044z = -1;
        this.f5030A = -1;
        this.f5031B = -1;
        this.f5035p = searchView;
        this.f5036q = searchableInfo;
        this.f5039t = searchView.getSuggestionCommitIconResId();
        this.f5037r = context;
        this.f5038s = weakHashMap;
    }

    public static String h(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    @Override // J.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i7;
        int i8;
        Drawable f7;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        i0 i0Var = (i0) view.getTag();
        int i9 = this.f5031B;
        int i10 = i9 != -1 ? cursor.getInt(i9) : 0;
        TextView textView = i0Var.f5024a;
        TextView textView2 = i0Var.f5025b;
        ImageView imageView = i0Var.f5028e;
        if (textView != null) {
            String h7 = h(cursor, this.f5042w);
            textView.setText(h7);
            if (TextUtils.isEmpty(h7)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f5037r;
        if (textView2 != null) {
            String h8 = h(cursor, this.y);
            if (h8 != null) {
                if (this.f5041v == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f5041v = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h8);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f5041v, null), 0, h8.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f5043x);
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
        ImageView imageView2 = i0Var.f5026c;
        if (imageView2 != null) {
            int i11 = this.f5044z;
            if (i11 == -1) {
                f7 = null;
            } else {
                f7 = f(cursor.getString(i11));
                if (f7 == null) {
                    ComponentName searchActivity = this.f5036q.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f5038s;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f7 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.w("SuggestionsAdapter", e4.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                            } else {
                                f7 = drawable;
                                weakHashMap.put(flattenToShortString, f7 != null ? null : f7.getConstantState());
                            }
                        }
                        f7 = null;
                        weakHashMap.put(flattenToShortString, f7 != null ? null : f7.getConstantState());
                    }
                    if (f7 == null) {
                        f7 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f7);
            if (f7 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f7.setVisible(false, false);
                f7.setVisible(true, false);
            }
        }
        ImageView imageView3 = i0Var.f5027d;
        if (imageView3 != null) {
            int i12 = this.f5030A;
            Drawable f8 = i12 == -1 ? null : f(cursor.getString(i12));
            imageView3.setImageDrawable(f8);
            if (f8 != null) {
                imageView3.setVisibility(0);
                f8.setVisible(false, false);
                i7 = 1;
                f8.setVisible(true, false);
                i8 = this.f5040u;
                if (i8 == 2 && (i8 != i7 || (i10 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i7 = 1;
        i8 = this.f5040u;
        if (i8 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // J.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f5042w = cursor.getColumnIndex("suggest_text_1");
                this.f5043x = cursor.getColumnIndex("suggest_text_2");
                this.y = cursor.getColumnIndex("suggest_text_2_url");
                this.f5044z = cursor.getColumnIndex("suggest_icon_1");
                this.f5030A = cursor.getColumnIndex("suggest_icon_2");
                this.f5031B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // J.b
    public final String c(Cursor cursor) {
        String h7;
        String h8;
        if (cursor == null) {
            return null;
        }
        String h9 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h9 != null) {
            return h9;
        }
        SearchableInfo searchableInfo = this.f5036q;
        if (searchableInfo.shouldRewriteQueryFromData() && (h8 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h8;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h7 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h7;
    }

    @Override // J.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f5034o.inflate(this.f5032m, viewGroup, false);
        inflate.setTag(new i0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f5039t);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f5037r.getPackageManager().getResourcesForApplication(authority);
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
        WeakHashMap weakHashMap = this.f5038s;
        Context context = this.f5037r;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable b7 = AbstractC0666a.b(context, parseInt);
                if (b7 != null) {
                    weakHashMap.put(str2, b7.getConstantState());
                }
                return b7;
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
                        } catch (IOException e7) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e7);
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
        return this.f5037r.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // J.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View inflate = this.f5034o.inflate(this.f5033n, viewGroup, false);
            if (inflate != null) {
                ((i0) inflate.getTag()).f5024a.setText(e4.toString());
            }
            return inflate;
        }
    }

    @Override // J.b, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View d7 = d(viewGroup);
            ((i0) d7.getTag()).f5024a.setText(e4.toString());
            return d7;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1232h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1232h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5035p.n((CharSequence) tag);
        }
    }
}
