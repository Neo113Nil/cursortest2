package com.yasirkula.unity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class NativeShareCustomShareDialog extends DialogFragment {
    private boolean sentShareResult;

    private static class CustomShareDialogAdapter extends ArrayAdapter<ResolveInfo> {
        private PackageManager packageManager;
        private Activity unityActivity;

        private static class ViewHolder {
            private final ImageView icon;
            private final TextView label;

            public ViewHolder(TextView label, ImageView icon) {
                this.label = label;
                this.icon = icon;
            }
        }

        private CustomShareDialogAdapter(Activity unityActivity, List<ResolveInfo> apps) {
            super(unityActivity, R.layout.native_share_grid_element, apps);
            this.unityActivity = unityActivity;
            this.packageManager = unityActivity.getPackageManager();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = this.unityActivity.getLayoutInflater().inflate(R.layout.native_share_grid_element, parent, false);
                convertView.setTag(new ViewHolder((TextView) convertView.findViewById(R.id.native_share_app_name), (ImageView) convertView.findViewById(R.id.native_share_app_icon)));
            }
            ResolveInfo item = getItem(position);
            ViewHolder viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.label.setText(item.loadLabel(this.packageManager));
            viewHolder.icon.setImageDrawable(item.loadIcon(this.packageManager));
            return convertView;
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        final Intent CreateIntentFromBundle = NativeShare.CreateIntentFromBundle(getActivity(), getArguments(), arrayList);
        String string = getArguments().getString(NativeShareFragment.TITLE_ID);
        ArrayList<String> stringArrayList = getArguments().getStringArrayList(NativeShareFragment.TARGET_PACKAGE_ID);
        ArrayList<String> stringArrayList2 = getArguments().getStringArrayList(NativeShareFragment.TARGET_CLASS_ID);
        PackageManager packageManager = getActivity().getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(CreateIntentFromBundle, 65536);
        if (arrayList.size() > 0) {
            NativeShare.GrantURIPermissionsToShareIntentTargets(getActivity(), queryIntentActivities, arrayList);
        }
        if (stringArrayList.size() > 1) {
            for (int size = queryIntentActivities.size() - 1; size >= 0; size--) {
                ActivityInfo activityInfo = queryIntentActivities.get(size).activityInfo;
                String str = activityInfo.applicationInfo.packageName;
                String str2 = activityInfo.name;
                for (int size2 = stringArrayList.size() - 1; size2 >= 0; size2--) {
                    if (str.equals(stringArrayList.get(size2)) && (stringArrayList2.get(size2).length() == 0 || str2.equals(stringArrayList2.get(size2)))) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (!z) {
                    queryIntentActivities.remove(size);
                }
            }
        }
        if (queryIntentActivities.size() == 0) {
            return new AlertDialog.Builder(getActivity()).setTitle(string).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.yasirkula.unity.NativeShareCustomShareDialog.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialog, int which) {
                    NativeShareCustomShareDialog.this.dismiss();
                }
            }).setMessage("No apps can perform this action.").create();
        }
        if (queryIntentActivities.size() == 1) {
            StartTargetActivity(CreateIntentFromBundle, queryIntentActivities.get(0).activityInfo);
            dismiss();
        } else {
            Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        }
        final CustomShareDialogAdapter customShareDialogAdapter = new CustomShareDialogAdapter(getActivity(), queryIntentActivities);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.native_share_grid_view, (ViewGroup) null);
        GridView gridView = (GridView) inflate.findViewById(R.id.native_share_grid_view_holder);
        gridView.setAdapter((ListAdapter) customShareDialogAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.yasirkula.unity.NativeShareCustomShareDialog.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NativeShareCustomShareDialog.this.StartTargetActivity(CreateIntentFromBundle, customShareDialogAdapter.getItem(position).activityInfo);
                NativeShareCustomShareDialog.this.dismiss();
            }
        });
        return new AlertDialog.Builder(getActivity()).setTitle(string).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.yasirkula.unity.NativeShareCustomShareDialog.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                NativeShareCustomShareDialog.this.dismiss();
            }
        }).setView(inflate).create();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dismiss();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.sentShareResult) {
            return;
        }
        this.sentShareResult = true;
        NativeShare.shareResultReceiver.OnShareCompleted(2, BuildConfig.FLAVOR);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d("Unity", "Dismissed custom share dialog");
        if (!this.sentShareResult) {
            this.sentShareResult = true;
            NativeShare.shareResultReceiver.OnShareCompleted(2, BuildConfig.FLAVOR);
        }
        Activity activity = getActivity();
        if (activity == null || !(activity instanceof NativeShareCustomShareDialogActivity)) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void StartTargetActivity(final Intent shareIntent, final ActivityInfo targetActivity) {
        ComponentName componentName = new ComponentName(targetActivity.applicationInfo.packageName, targetActivity.name);
        String flattenToString = componentName.flattenToString();
        Log.d("Unity", "Shared on app: " + flattenToString);
        NativeShare.shareResultReceiver.OnShareCompleted(1, flattenToString);
        this.sentShareResult = true;
        shareIntent.setFlags(268435456);
        shareIntent.setComponent(componentName);
        startActivity(shareIntent);
    }
}
