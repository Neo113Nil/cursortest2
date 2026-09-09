# Проверка подозрительных доменов

Кастомный хост из кода приложения (StringFog): `rapidtraceengine.online`.
Это адрес тихой проверки (gate), а не SDK.

Пайплайн мог зацепить `app.adjust.io` / `gdpr.adjust.io` / `ssrv.adjust.io` (SDK Adjust),
`config.ru` (языковой split Android App Bundle `config.ru`, не сайт) и
`dispatchers.io` (класс Kotlin `Dispatchers.IO`, не сайт). По правилам отчёта
это не подозрительные домены.

## Проверка домена: rapidtraceengine.online

Формат как на VirusTotal → Security vendors' analysis, в конце три доп. пункта.

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | rapidtraceengine.online |
| VirusTotal URL | https://www.virustotal.com/gui/domain/rapidtraceengine.online |
| Детекции | 0/89 (malicious=0, suspicious=0) |
| Security vendors' analysis | ниже построчно, как на VirusTotal |
| Abusix | Clean |
| Acronis | Clean |
| ADMINUSLabs | Clean |
| AILabs (MONITORAPP) | Clean |
| AlienVault | Clean |
| Antiy-AVL | Clean |
| BitDefender | Clean |
| Blueliv | Clean |
| Certego | Clean |
| Chong Lua Dao | Clean |
| CINS Army | Clean |
| CRDF | Clean |
| CTX AI | Clean |
| Cyble | Clean |
| CyRadar | Clean |
| desenmascara.me | Clean |
| Dr.Web | Clean |
| EmergingThreats | Clean |
| Emsisoft | Clean |
| ESET | Clean |
| ESTsecurity | Clean |
| Forcepoint ThreatSeeker | Clean |
| Fortinet | Clean |
| G-Data | Clean |
| Google Safe Browsing | Clean |
| GreenSnow | Clean |
| Heimdal Security | Clean |
| IPsum | Clean |
| Juniper Networks | Clean |
| Kaspersky | Clean |
| Lionic | Clean |
| Malwared | Clean |
| MalwarePatrol | Clean |
| OpenPhish | Clean |
| Phishtank | Clean |
| PREBYTES | Clean |
| Quick Heal | Clean |
| Quttera | Clean |
| Scantitan | Clean |
| SCUMWARE.org | Clean |
| Seclookup | Clean |
| Sophos | Clean |
| StopForumSpam | Clean |
| Sucuri SiteCheck | Clean |
| ThreatHive | Clean |
| URLhaus | Clean |
| Viettel Threat Intelligence | Clean |
| ViriBack | Clean |
| VX Vault | Clean |
| Webroot | Clean |
| Xcitium Verdict Cloud | Clean |
| Yandex Safebrowsing | Clean |
| ZeroCERT | Clean |
| Netcraft | Clean |
| alphaMountain.ai | Unrated |
| CMC Threat Intelligence | Unrated |
| Criminal IP | Unrated |
| LevelBlue | Unrated |
| 0xSI_f33d | Unrated |
| AlphaSOC | Unrated |
| ArcSight Threat Intelligence | Unrated |
| AutoShun | Unrated |
| Axur | Unrated |
| Bfore.Ai PreCrime | Unrated |
| Bkav | Unrated |
| ChainPatrol | Unrated |
| CSIS Security Group | Unrated |
| Cyan | Unrated |
| DNS8 | Unrated |
| Ermes | Unrated |
| Fortra | Unrated |
| GCP Abuse Intelligence | Unrated |
| GreyNoise | Unrated |
| Gridinsoft | Unrated |
| Guardpot | Unrated |
| Hunt.io Intelligence | Unrated |
| Lumu | Unrated |
| MalwareURL | Unrated |
| Mimecast | Unrated |
| PhishFort | Unrated |
| PrecisionSec | Unrated |
| SafeToOpen | Unrated |
| Sansec eComscan | Unrated |
| SecureBrain | Unrated |
| Snort IP sample list | Unrated |
| SOCRadar | Unrated |
| URLQuery | Unrated |
| VIPRE | Unrated |
| ZeroFox | Unrated |
| Куда редиректит | нет (HTTP 403 Cloudflare, без редиректа) |
| Что выводит (кратко) | пустой ответ, код 403 |
| Где припаркован | регистратор: NameCheap, Inc.; DNS: Cloudflare |
